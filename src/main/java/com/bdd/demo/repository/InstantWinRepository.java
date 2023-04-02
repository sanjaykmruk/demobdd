package com.bdd.demo.repository;

import com.bdd.demo.model.InstantWin;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstantWinRepository extends MongoRepository<InstantWin, String> {
}
