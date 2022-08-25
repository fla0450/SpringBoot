package com.example.demo.signUp;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Getter
public class UserInfo implements UserDetails {
    @Id
    @Column(name="code")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code;
    @Column(name ="email",unique = true)
    private String email;
}
