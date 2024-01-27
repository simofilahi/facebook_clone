package com.example.demo.controller;

import com.example.demo.entity.Post;
import com.example.demo.service.PostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController()
public class PostController {

    PostService postService;

    @PostMapping("/posts")
    public Post createPost(@RequestBody Post post){
        return postService.createPost(post);
    }

    @GetMapping("/posts")
    public List<Post> getPosts(){
        return postService.getPosts();
    }

    @GetMapping("/posts/{id}")
    public Optional<Post> getPost(@PathVariable long id){
        return postService.getPost(id);
    }
}
