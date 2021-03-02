package com.github.YBychkovskyi.FirstProject;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


import static javax.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@Entity
@Table(name = "comment")
public class TableComment implements Serializable {
  @Id
  @GeneratedValue(strategy = IDENTITY)
  @Column(name = "id")
  private int id;

  @Column(name = "text")
  private String text;

  @Column(name = "username")
  private String username;

  @Column(name = "createdAt")
  private Date createdAt;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "post_id")
  private TablePost post;



}


