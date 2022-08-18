package com.example.springbootjpaonetoonemapping;

import com.example.springbootjpaonetoonemapping.entity.Gender;
import com.example.springbootjpaonetoonemapping.entity.User;
import com.example.springbootjpaonetoonemapping.entity.UserProfile;
import com.example.springbootjpaonetoonemapping.repository.UserProfileRepo;
import com.example.springbootjpaonetoonemapping.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class SpringbootjpaOnetooneMappingApplication  {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootjpaOnetooneMappingApplication.class, args);
	}


}
