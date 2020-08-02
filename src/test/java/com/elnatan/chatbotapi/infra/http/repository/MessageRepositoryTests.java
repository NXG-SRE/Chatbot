package com.elnatan.chatbotapi.infra.http.repository;

import com.elnatan.chatbotapi.entity.MessageEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

/*
@DataMongoTest
@ExtendWith(SpringExtension.class)
*/
@SpringBootTest
public class MessageRepositoryTests {
    @Autowired
    private MessageRepository message;

    @Test
    public void getMessage() {
        String id = UUID.randomUUID().toString();
        MessageEntity messageEntity = new MessageEntity("Hi!", "bot@test.com");
        messageEntity.setId(id);
        message.save(messageEntity);

        boolean found = Boolean.FALSE;

        for (MessageEntity entity : message.findAll()) {
            if (!entity.getText().isEmpty() && entity.getId().contentEquals(id)) {
                found = Boolean.TRUE;
            }
        }

        assert found;
    }
}
