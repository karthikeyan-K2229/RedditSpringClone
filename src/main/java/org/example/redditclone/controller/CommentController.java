package org.example.redditclone.controller;

import org.example.redditclone.dto.CommentsDto;
import org.example.redditclone.model.Comment;
import org.example.redditclone.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/comments")
@RestController
public class CommentController {

    @Autowired
    private CommentService commentService;

    @PostMapping("/save/comments")
    public ResponseEntity<Void> saveComment(@RequestBody CommentsDto commentsDto)
    {
        commentService.savecomment(commentsDto);
     return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("params = postId")
    public ResponseEntity<List<Comment>> getAllcomments(@RequestParam Long postId)
    {
        return (ResponseEntity<List<Comment>>) commentService.getAllCommentByID(postId);
    }

    @GetMapping("params= userName")
    public ResponseEntity<List<CommentsDto>> getAllcommentsByUser(@RequestParam String userName)
    {
        return (ResponseEntity<List<CommentsDto>>) commentService.getAllByUser(userName);
    }
}
