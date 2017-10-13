package me.maweiyi.spear.service.impl;

import me.maweiyi.spear.domain.User;
import me.maweiyi.spear.mapper.AuthMapper;
import me.maweiyi.spear.service.AuthService;
import me.maweiyi.spear.util.EncryptMd5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

@Service
public class AuthServiceImpl implements AuthService {
    @Autowired
    private AuthMapper authMapper;
    @Override
    public Boolean checkLogin(String username, String password) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        //检测用户的用户名密码
        String passwords = EncryptMd5.EncoderByMd5(password);
        User user = authMapper.checkLogin(username, passwords);
        return user.getUsername().equals(username) && user.getPasswrod().equals(EncryptMd5.EncoderByMd5(password));
    }
}
