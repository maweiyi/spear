package me.maweiyi.spear.domain;

import lombok.Data;

@Data
public class Option {
    private String site_title;
    private String site_url;
    private String admin_user;
    private String admin_email;
    private String admin_pwd;
    private int created;
}
