package org.example.redditclone.service;

import org.example.redditclone.dto.PostRequest;
import org.example.redditclone.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    @Autowired
    public PostRepository postRepository;
    public void savePost(PostRequest postRequest) {
        postRepository.save(postRequest);
    }
}
