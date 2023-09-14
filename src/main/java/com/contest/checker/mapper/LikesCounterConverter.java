//package com.contest.checker.mapper;
//
//import com.contest.checker.collection.Post;
//import com.contest.checker.dto.PostDto;
//import lombok.AllArgsConstructor;
//import org.modelmapper.AbstractConverter;
//import org.modelmapper.ModelMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//
//@Component
//public class LikesCounterConverter extends AbstractConverter<Post, PostDto> {
//
//    @Autowired
//    private ModelMapper modelMapper;
//
//    @Override
//    protected PostDto convert(Post post) {
//
//        Integer numOfLikes=post.getLikes()==null?0:post.getLikes().size();
//
//        PostDto postDto=new PostDto();
//        postDto.setNumberOfLikes(numOfLikes);
//
//        modelMapper.map(post,postDto);
//
//        return postDto;
//
//
//    }
//}
