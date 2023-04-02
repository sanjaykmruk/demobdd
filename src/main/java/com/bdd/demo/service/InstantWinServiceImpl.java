package com.bdd.demo.service;

import com.bdd.demo.model.InstantWin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InstantWinServiceImpl implements InstantWinService {

    @Autowired
    InstantWinRepositoryService iwRepositoryService;

    @Override
    public Boolean isInstantWin(int storeId, int txnId) {

        InstantWin instantWin = iwRepositoryService.incrementCounter(storeId);
        return txnId == instantWin.getCounter();
    }
}
