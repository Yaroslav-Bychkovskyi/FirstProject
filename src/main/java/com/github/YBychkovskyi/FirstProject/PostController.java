package com.github.YBychkovskyi.FirstProject;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

  PostRepository postRepository;

  public PostController(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  @PostMapping("/salo")
  public Post post(@RequestBody Post postDto){
    Post post = null;

    final var tablePost = new TablePost();
    tablePost.setText(postDto.getText());
    tablePost.setUsername(postDto.getUsername());
    tablePost.setCreateAt(postDto.getCreateAt());

    postRepository.save(tablePost);
    return post;
  }



}
