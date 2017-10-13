package me.maweiyi.spear.domain;

import lombok.Data;

@Data
public class Metas {
    private Integer mid;

    private String name;

    private String slug;

    private String type;

    private String description;

    private Integer sort;

    private Integer parent;
}
