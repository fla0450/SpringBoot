package com.example.demo.signUp;

import com.example.demo.Role;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.catalina.User;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.persistence.*;

@Entity
@Table(name = "test_user")
@Getter @Setter
@ToString
public class Member {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    @Column(unique = true)
    private String email;
    private String password;
    private String name;
    @Enumerated(EnumType.STRING)
    private Role role;
    public static Member crateMember(UserDto userDto, PasswordEncoder passwordEncoder){
        Member member = new Member();
        member.setName(member.getName());
        member.setEmail(member.getEmail());
        String password = passwordEncoder.encode(userDto.getPassword());
        member.setPassword(password);
        member.setRole(Role.USER);
        return member;
    }
}
