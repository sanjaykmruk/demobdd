package com.bdd.demo.model;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Document("InstantWinCollection")
public class InstantWin {

    @Id
    private String id;

    private final int storeId;
    private final int txnId;
    private final int counter;

    public InstantWin(Integer storeId, Integer txnId, Integer counter) {
        this.storeId = storeId;
        this.txnId = txnId;
        this.counter = counter;
    }
}
