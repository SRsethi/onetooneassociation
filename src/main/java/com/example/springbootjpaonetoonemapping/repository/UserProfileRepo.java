package com.example.springbootjpaonetoonemapping.repository;

import com.example.springbootjpaonetoonemapping.entity.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProfileRepo extends JpaRepository<UserProfile, Long> {
}
