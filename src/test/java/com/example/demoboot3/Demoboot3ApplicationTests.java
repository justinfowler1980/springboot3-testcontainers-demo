package com.example.demoboot3;

import com.example.demoboot3.repository.DBUser;
import com.example.demoboot3.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.junit.jupiter.Testcontainers;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Demoboot3ApplicationTests extends AbstractIntegrationTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void testUSerRepository() {
        userRepository.saveAndFlush(DBUser.builder()
                .id(UUID.randomUUID())
                .version(0L)
                .cognitoId(UUID.randomUUID())
                .basiqId("KKJLK")
                .postcode("1234")
                .build());

        assertEquals(userRepository.count(), 1);
    }
}
