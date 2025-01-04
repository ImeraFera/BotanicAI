package com.backend.backend.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.backend.models.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, UUID> {

}
