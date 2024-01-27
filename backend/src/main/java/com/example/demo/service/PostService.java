package com.example.demo.service;

import com.example.demo.entity.Post;
import com.example.demo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service()
public class PostService {

    @Autowired
    PostRepository postRepository;

    public List<Post> getPosts() {
        return postRepository.findAll();
    }

    public Optional<Post> getPost(long id) {
        return postRepository.findById(id);
    }

    public Post createPost(Post post) {
        return postRepository.save(post);
    }
}
