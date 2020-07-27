package com.intulda.blog.posts.service;

import com.intulda.blog.posts.service.dto.Post;

import java.util.List;

public interface IPostService {

    public List<Post> insertPosts(Post post);
}
