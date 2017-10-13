package me.maweiyi.spear.domain;

import lombok.Data;

@Data
public class User {
    private String username;

    private String passwrod;

    private String rememberOn;

    private String email;

    private String home_url;

    private String screen_name;

    private int created;

    private int logged;

    private String group_name;
}
