package com.bdd.demo.controller;

import com.bdd.demo.service.InstantWinService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AppController {

    @Autowired
    InstantWinService instantWinService;

    @GetMapping("/instantwin")
    @ResponseBody
    public Boolean checkInstantWin(@RequestParam("storeId") int storeId, @RequestParam("txnId")int txnId) {

        boolean iw = instantWinService.isInstantWin(storeId, txnId);
        return iw;

    }
}
