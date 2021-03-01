package com.github.YBychkovskyi.FirstProject;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "comment")
public class TableComment implements Serializable {
  private int id;
  private String text;
  private String username;
  private Date createdAt;


  @Id
  @GeneratedValue(strategy = IDENTITY)
  @Column(name = "id")
  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Column(name = "text")
  public String getText() {
    return this.text;
  }

  public void setText(String text) {
    this.text = text;
  }

  @Column(name = "username")
  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  @Column(name = "createdAt")
  public Date getCreatedAt(Date createAt) {
    return this.createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  private TablePost post;

  @ManyToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "post_id")
  public TablePost getPost() {
    return post;
  }

  public void setPost(TablePost post) {
    this.post = post;
  }
}


