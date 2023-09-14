package com.contest.checker.dto;

import com.contest.checker.entity.Gender;
import lombok.Data;

@Data
public class UserWithRoleNameDto {

    private Long userId;
    private String firstName;
    private String lastName;
    private String email;
    private Gender gender;
    private String avatar;
    private String mobile;
    private String job;
    private String company;
    private String roleName;

}
