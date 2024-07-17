package org.yunho.boardservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yunho.boardservice.domain.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
