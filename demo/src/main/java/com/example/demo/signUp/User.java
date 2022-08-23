package com.example.demo.signUp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="test_user")
public class User {
    @Id
    private String Username;
    private String passwd;
    private String name;
}
