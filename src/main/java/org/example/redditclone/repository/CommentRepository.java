package org.example.redditclone.repository;

import org.example.redditclone.model.Comment;
import org.springframework.data.repository.CrudRepository;

public interface CommentRepository extends CrudRepository<Comment,Long> {

}
