package me.maweiyi.spear.service.impl;

import me.maweiyi.spear.domain.Option;
import me.maweiyi.spear.mapper.OptionMapper;
import me.maweiyi.spear.service.OptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OptionServiceImpl implements OptionService {

    @Autowired
    private OptionMapper mapper;

    @Override
    public void insertOption(Option option) {

    }
}
