package com.github.YBychkovskyi.FirstProject;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

import java.util.HashSet;

import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

@Getter
@Setter

@Entity
@Table(name = "post")
public class TablePost  implements Serializable {

  @Id
  @GeneratedValue(strategy = IDENTITY)
  @Column(name = "id")
  private int id;

  @Column(name = "text")
  private String text;

  @Column(name = "username")
  private String username;

  @Temporal(TemporalType.DATE)
  @Column(name = "createAt")
  private Date createAt;

  @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
  private Set<TableComment> comments;


  @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
  private Set<TableLike> likes;



/* private TableComment comment;

 @ManyToOne
  @JoinColumn(name = "id", referencedColumnName  = "TablePost_Id")
  public TableComment getComment() {
    return this.comment;
  }

  public void setComment(TableComment comment) {
    this.comment = comment;
  }*/


  private Set<TableComment> tableComments = new HashSet<TableComment>();

  @OneToMany(mappedBy = "post", cascade = CascadeType.ALL, orphanRemoval = true)
  public Set<TableComment> getTableComments() {
    return this.tableComments;
  }

  public void setTableComments(Set<TableComment> tableComments) {
    this.tableComments = tableComments;
  }

  public void addTebleComment(TableComment tableComments) {
    tableComments.setPost(this);
    getTableComments().add(tableComments);
  }

  public void removeTableComment(TablePost tableComments) {
    getTableComments().remove(tableComments);
  }

}


