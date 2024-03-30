package org.example.redditclone.controller;

import org.example.redditclone.dto.CommentsDto;
import org.example.redditclone.model.Comment;
import org.example.redditclone.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/comments")
@RestController
public class CommentController {

    @Autowired
    private CommentService commentService;

    @PostMapping("/save/comments")
    public ResponseEntity<CommentsDto> saveComment(@RequestBody CommentsDto commentsDto)
    {
        CommentsDto comment=commentService.savecomments(commentsDto);
       return new ResponseEntity<>(comment,HttpStatus.OK);
    }

}
