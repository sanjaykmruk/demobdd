package com.bdd.demo.service;

import com.bdd.demo.model.InstantWin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class InstantWinRepositoryServiceImpl implements InstantWinRepositoryService {

    public static final String STORE_ID = "storeId";

    @Autowired
    MongoTemplate mongoTemplate;

    private static final String COUNTER = "counter";

    @Override
    public InstantWin incrementCounter(int storeId) {
        Query query = new Query();
        query.addCriteria(Criteria.where(STORE_ID).is(storeId));

        Update update = new Update();
        update.inc(COUNTER, 1);

        FindAndModifyOptions options = FindAndModifyOptions.options().returnNew(true).upsert(true);
        return mongoTemplate.findAndModify(query, update, options, InstantWin.class);
    }
}
