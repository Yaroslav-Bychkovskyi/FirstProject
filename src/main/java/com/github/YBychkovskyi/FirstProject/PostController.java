package com.github.YBychkovskyi.FirstProject;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
public class PostController {

  PostRepository postRepository;
  CommentRepository commentRepository;
  LikeRepository likeRepository;

  @PostMapping("/addpost")
  public Post post(@RequestBody Post postDto) {


    final var tablePost = new TablePost();

    tablePost.setText(postDto.getText());
    tablePost.setUsername(postDto.getUsername());
    tablePost.setCreateAt(postDto.getCreatedAt());

    TablePost save = postRepository.save(tablePost);
    Post post = new Post();
    post.setId(save.getId());
    post.setText(save.getText());
    post.setUsername(save.getUsername());
    post.setCreatedAt(save.getCreateAt());

    return post;
  }

  @PostMapping("/addcomment")
  public Comment comment(@RequestBody Comment comments) {

    final var tableComment = new TableComment();
    tableComment.setId(comments.getId());
    tableComment.setText(comments.getText());
    tableComment.setUsername(comments.getUsername());
    tableComment.setCreatedAt(comments.getCreatedAt());

    TablePost one = postRepository.getOne(comments.getPostId());
    tableComment.setPost(one);

    TableComment save = commentRepository.save(tableComment);
    Comment comment = getComment(save);
    return comment;
  }

  private Comment getComment(TableComment save) {
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
    post.setId(tp.getId());
    post.setText(tp.getText());
    post.setUsername(tp.getUsername());
    post.setCreatedAt(tp.getCreateAt());

    List<Comment> comm = new ArrayList<>();
    post.setComments(comm);
    post.setLikes(tp.getLikes().size());
    for (TableComment t :
      tp.getComments()) {
      Comment gc = getComment(t);
      comm.add(gc);

    }
    return post;

  }

  @DeleteMapping("/comment")
  public Comment delComment(@RequestParam int comId) {
    Optional<TableComment> tc = commentRepository.findById(comId);
    if (tc.isPresent()) {
      commentRepository.delete(tc.get());
      return getComment(tc.get());
    }
    return null;
  }

  @DeleteMapping("/post")
  public Post delPost(@RequestParam int postId) {
    Optional<TablePost> tp = postRepository.findById(postId);
    if (tp.isPresent()) {
      postRepository.delete(tp.get());

    }
    return null;
  }

  @PostMapping("/like")
  public Like like(@RequestBody Like likes){

    final var tableLike = new TableLike();
    tableLike.setId(likes.getId());
    tableLike.setUsername(likes.getUsername());
    tableLike.setCreatedAt(likes.getCreatedAt());

    TablePost lk = postRepository.getOne(likes.getPostId());
    tableLike.setPost(lk);

    TableLike saves = likeRepository.save(tableLike);
    Like like = getLike(saves);
    return like;
  }

  private Like getLike(TableLike save) {
    Like like = new Like();
    like.setId(save.getId());
    like.setUsername(save.getUsername());
    like.setCreatedAt(save.getCreatedAt());

    like.setPostId(save.getPost().getId());
    return like;

  }

}
