package com.contest.checker.dto;

import lombok.Data;

@Data
public class UserCommentDto {

    private Long userId;
    private String firstName;
    private String lastName;
    private String email;
    private String avatar;
}
