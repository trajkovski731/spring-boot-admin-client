package com.north47.springbootadminclient.persistance.repository;

import com.north47.springbootadminclient.persistance.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
