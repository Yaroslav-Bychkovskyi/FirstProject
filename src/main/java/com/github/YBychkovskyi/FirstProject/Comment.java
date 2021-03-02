package com.github.YBychkovskyi.FirstProject;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Setter
@Getter
public class Comment {


  private int id;
  private String text;
  private String username;
  private Date createdAt;
  private int postId;


}
