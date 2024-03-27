package org.example.redditclone.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper
public class PostMapper {
    @Mapping(target = "createdDate", expression = "java(java.time.Instant.now())")
    @Mapping(target = "description", source = "postRequest.description")
    @Mapping(target = "subreddit", source = "subreddit")
    @Mapping(target = "voteCount", constant = "0")
    @Mapping(target = "user", source = "user")

}
