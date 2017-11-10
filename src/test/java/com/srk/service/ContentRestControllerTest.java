package com.srk.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ContentRestControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void shouldGetContent() throws Exception {
        String expectedResponse = "{\"id\":1,\"content\":\"Welcome to Rest World!!! Local is en_US\"}";

        String actualResponse = restTemplate.getForObject("/getContent", String.class);

        assertThat(actualResponse).isEqualTo(expectedResponse);
    }

}