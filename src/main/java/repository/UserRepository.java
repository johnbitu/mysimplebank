package repository;

import models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findUserByCpf(String cpf);

    Optional<User> findUserById(Long id);
}
