package com.north47.springbootadminclient.scheduler;

import com.north47.springbootadminclient.persistance.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DeleteUsersScheduler {

    private final UserRepository userRepository;

    public DeleteUsersScheduler(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Scheduled(cron = "0 * * * * *")
    public void deleteAllUsers() {
        log.info("=== CRON DELETE ALL USERS ===");
        userRepository.deleteAll();
    }

}
