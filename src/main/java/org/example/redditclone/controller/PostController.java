package org.example.redditclone.controller;

import lombok.AllArgsConstructor;
import org.example.redditclone.dto.PostRequest;
import org.example.redditclone.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class PostController {
    @Autowired
    private PostService postService;

    @PostMapping
    public ResponseEntity<PostRequest> PostMethod(@RequestBody PostRequest postRequest)
    {
        postService.savePost(postRequest);
        return new ResponseEntity<PostRequest>(HttpStatus.CREATED);
    }

}
