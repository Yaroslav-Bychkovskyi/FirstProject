package com.github.YBychkovskyi.FirstProject;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
public class PostController {

  PostRepository postRepository;
  CommentRepository commentRepository;

  @PostMapping("/salo")
  public Post post(@RequestBody Post postDto) {


    final var tablePost = new TablePost();
    tablePost.setText(postDto.getText());
    tablePost.setUsername(postDto.getUsername());
    tablePost.setCreateAt(postDto.getCreatedAt());

    TablePost save = postRepository.save(tablePost);
    Post post = new Post();
    post.setText(save.getText());
    post.setUsername(save.getUsername());
    post.setCreatedAt(save.getCreateAt());

    return post;
  }

  @PostMapping("/sl")
  public Comment comment(@RequestBody Comment comments) {

    final var tableComment = new TableComment();
    tableComment.setId(comments.getId());
    tableComment.setText(comments.getText());
    tableComment.setUsername(comments.getUsername());
    tableComment.setCreatedAt(comments.getCreatedAt());

    TablePost one = postRepository.getOne(comments.getPostId());
    tableComment.setPost(one);

    TableComment save = commentRepository.save(tableComment);
    Comment comment = new Comment();
    comment.setText(save.getText());
    comment.setId(save.getId());
    comment.setUsername(save.getUsername());
    comment.setCreatedAt(save.getCreatedAt());

    comment.setPostId(save.getPost().getId());
    return comment;
  }

  @GetMapping("/toget")
  public Post toGetPost(@RequestParam int postId) {
    TablePost tp = postRepository.getOne(postId);

    Post post = new Post();
    post.setText(tp.getText());
    post.setUsername(tp.getUsername());
    post.setCreatedAt(tp.getCreateAt());
    return post;

  }

}
