package com.github.YBychkovskyi.FirstProject;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Post {
  private int id;
  private String text;
  private String username;
  private Date createdAt;
  private List<Comment> comments;
  private int likes;


}
