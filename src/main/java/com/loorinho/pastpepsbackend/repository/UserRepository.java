package com.loorinho.pastpepsbackend.repository;

import com.loorinho.pastpepsbackend.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
//    Optional<User> findByEmail(String email);
}
