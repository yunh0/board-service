package org.yunho.boardservice.domain.projection;

import org.springframework.data.rest.core.config.Projection;
import org.yunho.boardservice.domain.ArticleComment;
import org.yunho.boardservice.domain.UserAccount;

import java.time.LocalDateTime;

@Projection(name = "withUserAccount", types = ArticleComment.class)
public interface ArticleCommentProjection {
    Long getId();
    UserAccount getUserAccount();
    Long getParentCommentId();
    String getContent();
    LocalDateTime getCreatedAt();
    String getCreatedBy();
    LocalDateTime getModifiedAt();
    String getModifiedBy();
}
