package com.backend.backend.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.backend.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

}
