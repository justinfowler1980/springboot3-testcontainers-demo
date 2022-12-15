package com.example.demoboot3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<DBUser, UUID> {

    DBUser findByCognitoId(UUID fromString);

}
