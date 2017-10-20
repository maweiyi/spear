package me.maweiyi.spear.mapper;

import me.maweiyi.spear.domain.Attach;
import me.maweiyi.spear.domain.Comments;
import me.maweiyi.spear.domain.Contents;
import java.util.List;

public interface SiteMapper {

    List<Comments> staticComment();
    List<Contents> staticContent();
    List<Attach> staticAttach();
    List<Contents> content();
    List<Comments> comment();

}
