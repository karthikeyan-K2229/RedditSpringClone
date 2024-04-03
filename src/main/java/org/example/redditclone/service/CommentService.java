package org.example.redditclone.service;

import org.example.redditclone.dto.CommentsDto;
import org.example.redditclone.exception.PostNotFoundException;
import org.example.redditclone.mapper.CommentMapper;
import org.example.redditclone.model.Comment;
import org.example.redditclone.model.Post;
import org.example.redditclone.model.User;
import org.example.redditclone.repository.CommentRepository;
import org.example.redditclone.repository.PostRepository;
import org.example.redditclone.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentMapper commentMapper;
    private CommentRepository commentRepository;
    private PostRepository postRepository;
    private User user;
    private UserRepository userRepository;

    public void savecomment(CommentsDto commentsDto) {
        Post post=postRepository.findById(commentsDto.getPostId()).orElseThrow(() -> new PostNotFoundException(commentsDto.getPostId().toString()));
        Comment comment = commentMapper.map(commentsDto, post,user.getUsername());
        commentRepository.save(comment);
    }

    public List<Comment> getAllCommentByID(Long postId)
    {
        Post post=postRepository.findById(postId).orElseThrow(()-> new PostNotFoundException(postId.toString()));
        return  commentRepository.findByPost(post);
    }

    public List<CommentsDto> getAllByUser(String userName) {
        User user = userRepository.findByUsername(userName).orElseThrow(() -> new UsernameNotFoundException(userName));
        return commentRepository.findAllByUser(user)
                .stream()
                .map(commentMapper::mapToDto)
                .toList();
    }



}
