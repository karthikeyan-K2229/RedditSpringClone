package org.example.redditclone.service;

import jakarta.transaction.Transactional;
import org.example.redditclone.dto.SubredditDto;
import org.example.redditclone.exception.SubredditNotFoundException;
import org.example.redditclone.model.Post;
import org.example.redditclone.model.Subreddit;
import org.example.redditclone.repository.SubreddittRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SubredditService {
    private static final String NOTFOUND="Subreddit does not exist ";
    @Autowired
    private SubreddittRepository subreddittRepository;

    @Transactional
    public Subreddit saveSubreddit(SubredditDto subredditDto) {
        Subreddit subreddit=new Subreddit();
        subreddit.setId(subreddit.getId());
     subreddit.setName(subredditDto.getName());
     subreddit.setDescription(subredditDto.getDescription());
     subreddit.setPosts(subreddit.getPosts());
    return subreddittRepository.save(subreddit);
    }

    @Transactional
    public List<Subreddit> getAllSubreddit() {
        return (List<Subreddit>)subreddittRepository.findAll();
    }

    @Transactional
    public Optional<Subreddit> findBysubredditId(Long id) {
        Subreddit Id=subreddittRepository.findById(id).orElseThrow(()-> new SubredditNotFoundException(NOTFOUND+id));
        return Optional.ofNullable(Id);

    }
}
