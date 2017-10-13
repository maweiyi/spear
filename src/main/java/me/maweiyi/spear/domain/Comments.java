package me.maweiyi.spear.domain;

import lombok.Data;
import org.hibernate.validator.constraints.Email;


@Data
public class Comments {

    private Integer coid;

    private Integer cid;

    private Integer created;

    private String author;

    private Integer author_id;

    private Integer owner_id;

    @Email(message = "请输入正确的邮件格式")
    private String mail;

    private String url;

    private String ip;

    private String agent;

    private String content;

    private String type;

    private String status;

    private Integer parent;




}
