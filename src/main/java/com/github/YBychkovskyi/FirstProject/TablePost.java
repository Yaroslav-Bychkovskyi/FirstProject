package com.github.YBychkovskyi.FirstProject;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
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


}


