package me.maweiyi.spear.domain;

import lombok.Data;

@Data
public class Logs {
    private Integer id;

    private String action;

    private String data;

    private Integer author_id;

    private String ip;

    private Integer created;
}
