package org.yunho.boardservice.repository.querydsl;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.yunho.boardservice.domain.Hashtag;
import org.yunho.boardservice.domain.QHashtag;

import java.util.List;

public class HashtagRepositoryCustomImpl extends QuerydslRepositorySupport implements HashtagRepositoryCustom {

    public HashtagRepositoryCustomImpl() {
        super(Hashtag.class);
    }

    @Override
    public List<String> findAllHashtagNames() {
        QHashtag hashtag = QHashtag.hashtag;

        return from(hashtag)
                .select(hashtag.hashtagName)
                .fetch();
    }

}
