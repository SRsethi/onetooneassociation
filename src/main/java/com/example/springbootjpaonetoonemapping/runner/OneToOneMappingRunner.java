package com.example.springbootjpaonetoonemapping.runner;

import com.example.springbootjpaonetoonemapping.entity.Gender;
import com.example.springbootjpaonetoonemapping.entity.User;
import com.example.springbootjpaonetoonemapping.entity.UserProfile;
import com.example.springbootjpaonetoonemapping.repository.UserProfileRepo;
import com.example.springbootjpaonetoonemapping.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import java.time.LocalDate;

public class OneToOneMappingRunner implements CommandLineRunner {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private UserProfileRepo userProfileRepo;

    @Override
    public void run(String... args) throws Exception {
            User user = new User();
            user.setName("Ranjan");
            user.setEmail("ranjan@gmail.com");

            UserProfile userProfile = new UserProfile();
            userProfile.setAddress("Odīsha");
            userProfile.setDob(LocalDate.of(1999, 01, 16));
            userProfile.setGender(Gender.Male);
            userProfile.setPhoneNumber("7008538557");

            user.setUserProfile(userProfile);
            userProfile.setUser(user);

            userRepo.save(user);
        }
    }

