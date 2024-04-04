package org.example.redditclone.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.redditclone.model.VoteType;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VoteDto {
    private VoteType voteType;
    private Long postId;
}
