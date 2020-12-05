package com.user.repository;

import com.user.model.UserInfo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<UserInfo, Integer> {
    Optional<UserInfo> findByEmail(String email);
}
