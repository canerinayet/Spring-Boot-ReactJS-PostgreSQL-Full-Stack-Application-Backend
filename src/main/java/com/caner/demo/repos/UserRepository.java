package com.caner.demo.repos;
import com.caner.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByUserName(String name);

    User findByUserName(String userName);
}

