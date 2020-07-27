package com.intulda.blog.posts.service.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "Posts")
public class Post {

    @Id
    @GeneratedValue()
    private Long postNum;

    @Column(nullable = false)
    private String postTitle;

    @Column(nullable = false)
    private String postContent;

    @Column()
    private LocalDate postCreateDate;

    @Column()
    private LocalDate postUpdateDate;


    public Post() {
        this.postCreateDate = LocalDate.now();
        this.postUpdateDate = LocalDate.now();
    }
}
