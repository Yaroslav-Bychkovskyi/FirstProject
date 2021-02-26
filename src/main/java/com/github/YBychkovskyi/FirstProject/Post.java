package com.github.YBychkovskyi.FirstProject;

import javax.xml.crypto.Data;
import java.util.Date;

public class Post {
  private String text;
  private String username;
  private Date createAt;

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public Date getCreateAt() {
    return createAt;
  }

  public void setCreateAt(Date createAt) {
    this.createAt = createAt;
  }
}
