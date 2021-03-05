package com.github.YBychkovskyi.FirstProject;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Like {

  private int id;
  private String username;
  private Date createdAt;
  private int postId;

}
