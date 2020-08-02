package com.elnatan.chatbotapi.infra.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

@Configuration
public class MongoDBClient extends AbstractMongoClientConfiguration {
    @Value("${mongodb.server}")
    private String server;

    @Value("${mongodb.port}")
    private String port;

    @Value("${mongodb.username}")
    private String username;

    @Value("${mongodb.password}")
    private String password;

    @Value("${mongodb.database}")
    private String database;

    @Override
    protected String getDatabaseName() {
        return database;
    }

    @Override
    public MongoClient mongoClient() {
        return MongoClients.create("mongodb://" + username + ":" + password + "@" + server + ":" + port + "/" + database + "?retryWrites=false");
    }
}
