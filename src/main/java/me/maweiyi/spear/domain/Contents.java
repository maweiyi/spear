package me.maweiyi.spear.domain;


import lombok.Data;

@Data
public class Contents {

    private Integer cid;

    private String title;

    private String slug;

    private Integer created;

    private Integer modified;

    private String content;

    private Integer auth_id;

    private String type;

    private String status;

    private String fmt_type;

    private String tags;

    private String categories;

    private Integer hits;

    private Integer comments_num;

    private Integer allow_comment;

    private Integer allow_ping;

    private Integer allow_feed;

}
