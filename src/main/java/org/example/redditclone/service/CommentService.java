package org.example.redditclone.service;

import org.example.redditclone.dto.CommentsDto;
import org.example.redditclone.exception.PostNotFoundException;
import org.example.redditclone.mapper.CommentMapper;
import org.example.redditclone.model.Comment;
import org.example.redditclone.model.Post;
import org.example.redditclone.model.User;
import org.example.redditclone.repository.CommentRepository;
import org.example.redditclone.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentMapper commentMapper;
    private CommentRepository commentRepository;
    private PostRepository postRepository;
    private User user;

    public void savecomment(CommentsDto commentsDto) {
        Post post=postRepository.findById(commentsDto.getPostId()).orElseThrow(() -> new PostNotFoundException(commentsDto.getPostId().toString()));
        Comment comment = commentMapper.map(commentsDto, post,user.getUsername());
        commentRepository.save(comment);
    }

    public ResponseEntity<List<Comment>> getAllCommentByID(Long postId)
    {
        Post post=postRepository.findById(postId).orElseThrow(()-> new PostNotFoundException(postId.toString()));
        return (List<Comment>)commentRepository.findAll(postId);
    }
}
