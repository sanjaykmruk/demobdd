package com.bdd.demo;

import com.bdd.demo.model.InstantWin;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class DemoBddApplicationTests {

	@Autowired
	RestTemplate restTemplate;

	@Autowired
	MongoTemplate mongoTemplate;

	@Test
	void contextLoads() {
		mongoTemplate.findAll(InstantWin.class);
	}

}
