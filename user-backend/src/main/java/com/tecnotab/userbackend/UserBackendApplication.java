package com.tecnotab.userbackend;

import com.tecnotab.userbackend.dao.UserRepository;
import com.tecnotab.userbackend.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserBackendApplication implements CommandLineRunner {

    public static void main(String[] args) {

        SpringApplication.run(UserBackendApplication.class, args);
    }
    @Autowired
    UserRepository userRepo;

    @Override
    public void run(String... args) throws Exception {
        userRepo.save(new User("tomy", "wayso", "tommywayso@gamail.com"));
        userRepo.save(new User("ricardo", "milos", "ricardomilos@gamail.com"));
        userRepo.save(new User("emelya", "shukovskiy", "emelya@gamail.com"));
        userRepo.save(new User("andrew", "werdna", "werdna@gamail.com"));
    }
}
