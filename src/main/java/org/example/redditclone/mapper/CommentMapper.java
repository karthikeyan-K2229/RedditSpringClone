package org.example.redditclone.mapper;

import org.example.redditclone.dto.CommentsDto;
import org.example.redditclone.model.Comment;
import org.example.redditclone.model.Post;
import org.example.redditclone.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface CommentMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "text", source = "commentsDto.text")
    @Mapping(target = "createdDate", expression = "java(java.time.Instant.now())")
    @Mapping(target = "post", source = "post")
    @Mapping(target = "user", source = "user")
    @Mapping(target = "postId", expression = "java(comment.getPost().getPostId())")
    @Mapping(target = "userName", expression = "java(comment.getUser().getUsername())")
    Comment map(CommentsDto commentsDto, Post post, User user);
    CommentsDto mapToDto(Comment comment);

    Comment map(CommentsDto commentsDto, Post post, String username);
}
