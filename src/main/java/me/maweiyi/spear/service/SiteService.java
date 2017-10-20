package me.maweiyi.spear.service;

import me.maweiyi.spear.domain.Comments;
import me.maweiyi.spear.domain.Contents;

import java.util.List;

public interface SiteService {

    Integer staticComments();
    Integer staticContents();
    Integer staticAttach();
    List<Contents> contentTitle();
    List<Comments> comment();

}
