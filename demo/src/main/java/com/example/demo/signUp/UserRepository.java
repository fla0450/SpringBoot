package com.example.demo.signUp;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserInfo,Long> {
}
