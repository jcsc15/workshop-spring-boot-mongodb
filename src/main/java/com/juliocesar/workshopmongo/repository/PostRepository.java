package com.juliocesar.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.juliocesar.workshopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{
}