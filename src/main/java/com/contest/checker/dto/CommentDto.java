package com.contest.checker.dto;

import lombok.Data;

@Data
public class CommentDto {

    private Long commentId;
    private String text;
    private UserCommentDto user;
    private String postId;


}
