package com.contest.checker.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;

@Data
public class PostDto {

    private Long id;
    private String title;
    private String subtitle;
    private String description;
    private ArrayList<TagDto> tags;
    private CategoryDto category;
    private ArrayList<String> images;
    private int numberOfLikes;
    private Date publishedAt;
    private UserCommentDto author;

}
