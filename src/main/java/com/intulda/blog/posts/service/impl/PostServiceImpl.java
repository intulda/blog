package com.intulda.blog.posts.service.impl;

import com.intulda.blog.posts.repository.impl.PostRepositoryImpl;
import com.intulda.blog.posts.service.IPostService;
import com.intulda.blog.posts.service.dto.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements IPostService {

    private PostRepositoryImpl postRepository;

    public PostServiceImpl(PostRepositoryImpl postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public List<Post> insertPosts(Post post) {
        postRepository.insertPost(post);
        return postRepository.findAll();
    }
}
