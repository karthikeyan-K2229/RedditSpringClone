package org.example.redditclone.repository;

import org.example.redditclone.model.Comment;
import org.example.redditclone.model.Post;
import org.example.redditclone.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CommentRepository extends CrudRepository<Comment,Long> {

    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user1);
}
