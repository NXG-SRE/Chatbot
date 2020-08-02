package com.elnatan.chatbotapi.infra.http.repository;

import com.elnatan.chatbotapi.entity.MessageEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "message", path = "message")
public interface MessageRepository extends CrudRepository<MessageEntity, String> {
    @Override
    <S extends MessageEntity> S save(S entity);
    List<MessageEntity> findByAuthor(@Param("name") String name);
}
