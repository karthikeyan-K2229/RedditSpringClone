package org.example.redditclone.repository;

import org.example.redditclone.model.Subreddit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface SubreddittRepository extends CrudRepository<Subreddit,Long> {
}
