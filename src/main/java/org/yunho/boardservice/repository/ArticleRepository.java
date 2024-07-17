package org.yunho.boardservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.yunho.boardservice.domain.Article;

@RepositoryRestResource
public interface ArticleRepository extends JpaRepository<Article, Long> {
}
