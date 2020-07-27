package com.intulda.blog.posts;

import com.intulda.blog.posts.service.dto.Post;
import com.intulda.blog.posts.service.impl.PostServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/posts/*")
public class PostController {

    private PostServiceImpl postService;

    public PostController(PostServiceImpl postService) {
        this.postService = postService;
    }

    @PostMapping(value = "save")
    public List<Post> insertPost(@RequestBody Post post) {
        return postService.insertPosts(post);
    }
}
