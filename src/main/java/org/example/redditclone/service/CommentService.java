package org.example.redditclone.service;

import org.example.redditclone.dto.CommentsDto;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CommentService {

    @Transactional
    public CommentsDto savecomments(CommentsDto commentsDto) {
    }
}
