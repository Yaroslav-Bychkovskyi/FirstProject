package com.github.YBychkovskyi.FirstProject;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.io.Serializable;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "Comment")
public class TableComment  implements Serializable {
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
    public Date getCreatedAt() {
      return this.createdAt;
    }

    public void setCreatedAt(Date createdAt) {
      this.createdAt = createdAt;
    }


  }


