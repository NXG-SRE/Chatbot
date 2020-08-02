package com.elnatan.chatbotapi.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Getter @Setter
public class MessageEntity {
    @Id
    private String id;
    private String text;
    private String author;
    private String date;

    public MessageEntity(String text, String author) {
        this.setText(text);
        this.setAuthor(author);
        this.date = new Date().toString();
    }
}
