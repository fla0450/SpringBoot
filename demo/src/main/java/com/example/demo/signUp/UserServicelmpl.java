package com.example.demo.signUp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
@Service
public class UserServicelmpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Bean
    PasswordEncoder passwordEncoder(){
       return new BCryptPasswordEncoder();
    }
    @Override
    public void saveUser(String username, String passwd,String name) {
        UserInfo user =new UserInfo();
        user.setUsername(username);
        user.setPasswd(passwordEncoder().encode(passwd));
        user.setName(name);
        user.setRole("USER");
        userRepository.save(user);
    }
}
