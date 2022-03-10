package com.m7md.erpSystem.repos;

import com.m7md.erpSystem.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
