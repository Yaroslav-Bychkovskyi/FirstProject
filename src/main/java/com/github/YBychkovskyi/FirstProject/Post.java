package com.github.YBychkovskyi.FirstProject;

import lombok.Getter;
import lombok.Setter;

import javax.xml.crypto.Data;
import java.util.Date;

@Getter
@Setter
public class Post {
  private String text;
  private String username;
  private Date createdAt;


}
