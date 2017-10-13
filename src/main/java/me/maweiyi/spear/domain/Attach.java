package me.maweiyi.spear.domain;

import lombok.Data;

@Data
public class Attach {
    private Integer id;

    private String fname;

    private String fkey;

    private Integer author_id;

    private Integer created;
}
