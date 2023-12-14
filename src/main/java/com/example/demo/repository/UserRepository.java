package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    // ** JPA는 메서드의 이름을 분석하는 방식으로 쿼리문을 작성할 수 있는 능력자
    Optional<User> findByEmail(String email);

    Optional<User> findByEmailAndProvider(String email, String provider);
}
