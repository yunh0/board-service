package org.yunho.boardservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yunho.boardservice.domain.ArticleComment;

public interface ArticleCommentRepository extends JpaRepository<ArticleComment, Long> {
}
