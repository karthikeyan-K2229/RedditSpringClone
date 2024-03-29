package org.example.redditclone.exception;

public class SubredditNotFoundException extends RuntimeException {
    public SubredditNotFoundException(String s) {
        super(s);
    }
}
