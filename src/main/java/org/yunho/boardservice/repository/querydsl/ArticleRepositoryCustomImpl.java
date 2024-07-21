package org.yunho.boardservice.repository.querydsl;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.yunho.boardservice.domain.Article;
import org.yunho.boardservice.domain.QArticle;

import java.util.List;

public class ArticleRepositoryCustomImpl extends QuerydslRepositorySupport implements ArticleRepositoryCustom {

    public ArticleRepositoryCustomImpl() {
        super(Article.class);
    }

    @Override
    public List<String> findAllDistinctHashtags() {
        QArticle article = QArticle.article;

        return from(article)
                .distinct()
                .select(article.hashtag)
                .where(article.hashtag.isNotNull())
                .fetch();
    }

}
