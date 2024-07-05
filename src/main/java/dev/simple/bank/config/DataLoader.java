package dev.simple.bank.config;

import dev.simple.bank.models.UserType;
import dev.simple.bank.repository.UserTypeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class DataLoader implements CommandLineRunner {

    private final UserTypeRepository userTypeRepository;

    public DataLoader(UserTypeRepository userTypeRepository) {
        this.userTypeRepository = userTypeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Arrays.stream(UserType.Enum.values())
                .forEach(userType -> userTypeRepository.save(userType.get()));
    }
}