package com.github.YBychkovskyi.FirstProject;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PostController {

  PostRepository postRepository;
  CommentRepository commentRepository;

  public PostController(PostRepository postRepository, CommentRepository commentRepository) {
    this.postRepository = postRepository;
    this.commentRepository = commentRepository;
  }

  @PostMapping("/salo")
  public Post post(@RequestBody Post postDto) {
    Post post = null;

    final var tablePost = new TablePost();
    tablePost.setText(postDto.getText());
    tablePost.setUsername(postDto.getUsername());
    tablePost.setCreateAt(postDto.getCreateAt());

    postRepository.save(tablePost);
    return post;
  }

  @PostMapping("/sl")
  public Comment comment(@RequestBody Comment comments) {
    Comment comment = null;

    final var tableComment = new TableComment();
    tableComment.setId(comments.getId());
    tableComment.setText(comments.getText());
    tableComment.setUsername(comments.getUsername());
    tableComment.getCreatedAt(comments.getCreateAt());

    commentRepository.save(tableComment);
    return comment;
  }


}
