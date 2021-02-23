package com.github.YBychkovskyi.FirstProject;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;


@Entity
@Table(name = "Post")
public class TablePost  implements Serializable {

  private int id;
  private String text;
  private String username;
  private Date createAt;



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


  @Temporal(TemporalType.DATE)
  @Column(name = "createAt")
  public Date getCreateAt() {
    return this.createAt;
  }

  public void setCreateAt(Date createAt) {
    this.createAt = createAt;
  }


 private TableComment comment;

  @ManyToOne
  @JoinColumn(name = "TableComment_Id")
  public TableComment getTableComment() {
    return this.comment;
  }

  public void setTableComment(TableComment comment) {
    this.comment = comment;
  }
}


