package services;

import lombok.AllArgsConstructor;
import models.User;
import models.UserType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.UserRepository;

import java.math.BigDecimal;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public void validateTransaction(User payer, BigDecimal value) throws Exception {
        if(payer.getUserType() == UserType.MERCHANT){
            throw new Exception("Merchant user is not authorized to make transactions ");
        }

        if(payer.getBalance().compareTo(value.doubleValue()) < 0) {
            throw new Exception("User does not have enough balance");
        }
    }

    public User findUserById(Long id) throws Exception{
        return this.repository.findUserById(id).orElseThrow(() -> new Exception("User not found!"));
    }

    public void saveUser(User user ) {
        this.repository.save(user);
    }
}
