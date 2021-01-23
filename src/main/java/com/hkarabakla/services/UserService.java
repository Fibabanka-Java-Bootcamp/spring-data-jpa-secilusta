package com.hkarabakla.services;

import com.hkarabakla.entities.Address;
import com.hkarabakla.entities.User;
import com.hkarabakla.repositories.UserRepo;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    private final UserRepo userRepo;

    public UserService(UserRepo repo) {
        this.userRepo = repo;
    }

    public User findUserByName(String name){
        return userRepo.findByName(name);
    }

    public void userOperations() {
        User u = new User();
        u.setName("seciluser");

        Address address = new Address();
        address.setStreet("Gazo sokak");
        address.setNumber("7");
        address.setCity("Istanbul");

        u.setAddress(address);

        userRepo.save(u);

        System.out.println(userRepo.findAllByNameContainingIgnoreCase("se"));
    }
}
