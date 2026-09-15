package com.CodingBrajmohan.SecurityProject.services;



import com.CodingBrajmohan.SecurityProject.dto.PostDTO;

import java.util.List;

public interface PostService {

    List<PostDTO> getAllPosts();

    PostDTO createNewPost(PostDTO inputPost);

    PostDTO getPostById(Long postId);
}
