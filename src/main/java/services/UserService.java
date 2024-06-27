package services;

import lombok.AllArgsConstructor;
import models.User;
import models.UserType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.UserRepository;

import java.math.BigDecimal;

@Service
@AllArgsConstructor
public class UserService {

    @Autowired
    private UserRepository repository;

    public void validateTransaction(User payer, BigDecimal value) throws Exception {
        if(payer.getUserType() == UserType.MERCHANT){
            throw new Exception("Merchant user is not authorized to make transactions ");
        }
    }
}
