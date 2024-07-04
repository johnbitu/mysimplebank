package config;

import models.UserType;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import repository.UserTypeRepository;

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
