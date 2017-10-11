package me.maweiyi.spear.service.impl;

import me.maweiyi.spear.domain.Option;
import me.maweiyi.spear.mapper.OptionMapper;
import me.maweiyi.spear.service.OptionService;
import me.maweiyi.spear.util.EncryptMd5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

@Service
public class OptionServiceImpl implements OptionService {

    @Autowired
    private OptionMapper mapper;

    @Override
    public void insertOption(Option option) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        option.setAdmin_pwd(EncryptMd5.EncoderByMd5(option.getAdmin_pwd()));
        System.out.println(option);
        mapper.insertOption(option);
    }
}
