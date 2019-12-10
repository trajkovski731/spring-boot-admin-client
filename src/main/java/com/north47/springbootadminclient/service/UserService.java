package com.north47.springbootadminclient.service;

import com.north47.springbootadminclient.persistance.domain.User;
import com.north47.springbootadminclient.persistance.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Long createUser(String firstName, String lastName) {
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        userRepository.save(user);
        return user.getId();
    }

    /**
     * Can throw null pointer
     *
     * @param userId
     * @return
     */
    public User getUser(Long userId) {
        return userRepository.findById(userId).get();
    }
}
