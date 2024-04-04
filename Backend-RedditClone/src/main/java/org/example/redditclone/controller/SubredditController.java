package org.example.redditclone.controller;

import org.example.redditclone.dto.SubredditDto;
import org.example.redditclone.model.Post;
import org.example.redditclone.model.Subreddit;
import org.example.redditclone.service.SubredditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/api/subreddit")

@RestController
public class SubredditController {
    @Autowired
    private SubredditService subredditService;

    @PostMapping("/savesubreddit")
    public ResponseEntity<SubredditDto> createSubreddit(@RequestBody SubredditDto subredditDto)
    {
        subredditService.saveSubreddit(subredditDto);
        return new ResponseEntity<>(subredditDto, HttpStatus.CREATED);
    }

    @GetMapping("/getAllSubreddit")
    public ResponseEntity<List<Subreddit>> findAllPost()
    {
        List<Subreddit> subreddits=subredditService.getAllSubreddit();
        return new ResponseEntity<List<Subreddit>>(subreddits,HttpStatus.FOUND);
    }

    @GetMapping("/getbyid/{id}")
    public ResponseEntity<Optional<Subreddit>> findById(@PathVariable Long id) {
        Optional<Subreddit> SubredditId=subredditService.findBysubredditId(id);
                return ResponseEntity.ok(SubredditId);
    }

}
