package me.maweiyi.spear.service;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

public interface AuthService {

    public Boolean checkLogin(String username, String password) throws UnsupportedEncodingException, NoSuchAlgorithmException;
}
