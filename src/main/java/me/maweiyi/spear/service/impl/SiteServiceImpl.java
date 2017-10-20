package me.maweiyi.spear.service.impl;

import me.maweiyi.spear.domain.Attach;
import me.maweiyi.spear.domain.Comments;
import me.maweiyi.spear.domain.Contents;
import me.maweiyi.spear.mapper.SiteMapper;
import me.maweiyi.spear.service.SiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SiteServiceImpl implements SiteService {
    @Autowired
    private SiteMapper siteMapper;

    public Integer staticComments() {

       List<Comments> comments = siteMapper.staticComment();
       return comments.size();
    }

    public Integer staticContents() {
        List<Contents> contents = siteMapper.staticContent();
        return contents.size();
    }

    @Override
    public Integer staticAttach() {
        List<Attach> attaches = siteMapper.staticAttach();
        return attaches.size();
    }

    @Override
    public List<Contents> contentTitle() {
        List<Contents> contents = siteMapper.content();
        return contents;
    }

    @Override
    public List<Comments> comment() {
        List<Comments> comments = siteMapper.comment();
        return comments;
    }


}
