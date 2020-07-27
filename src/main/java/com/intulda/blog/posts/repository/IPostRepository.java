package com.intulda.blog.posts.repository;

import com.intulda.blog.posts.service.dto.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPostRepository extends JpaRepository<Post, Integer> {
}
