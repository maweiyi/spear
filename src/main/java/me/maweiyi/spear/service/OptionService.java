package me.maweiyi.spear.service;

import me.maweiyi.spear.domain.Option;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

public interface OptionService {

    public void insertOption(Option option) throws UnsupportedEncodingException, NoSuchAlgorithmException;
}
