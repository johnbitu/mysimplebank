package dev.simple.bank.repository;

import dev.simple.bank.models.UserType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTypeRepository extends JpaRepository<UserType, Long >{
}