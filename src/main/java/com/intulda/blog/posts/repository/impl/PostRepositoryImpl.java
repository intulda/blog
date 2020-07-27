package com.intulda.blog.posts.repository.impl;

import com.intulda.blog.posts.repository.IPostRepository;
import com.intulda.blog.posts.service.dto.Post;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PostRepositoryImpl{

    private IPostRepository repository;

    public PostRepositoryImpl(IPostRepository repository) {
        this.repository = repository;
    }

    public void insertPost(Post post) {
        repository.save(post);
    }

    public List<Post> findAll() {
        return repository.findAll();
    }
}
