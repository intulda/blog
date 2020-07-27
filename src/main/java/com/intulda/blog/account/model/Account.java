package com.intulda.blog.account.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
public class Account implements Serializable {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long accountId;
    @Column(nullable = false)
    private String id;
    @Column(nullable = false)
    private String password;
    @Column
    private String name;
    @Column
    private String email;

}
