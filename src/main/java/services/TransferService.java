package services;

import dtos.TransactionDTO;
import models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import repository.TransactionRepository;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Service
public class TransferService {

    @Autowired
    private UserService userService;

    @Autowired
    private TransactionRepository repository;

    /* Usado para fazer requisições HTTP para APIs RESTful */
    @Autowired
    private RestTemplate restTemplate;

    public void createTransaction(TransactionDTO transaction) throws Exception{
        User payer = this.userService.findUserById(transaction.payerId());
        User payee = this.userService.findUserById(transaction.payeeId());

        userService.validateTransaction(payer, transaction.value());

        boolean isAuthorized = this.authorizeTransaction(payer , transaction.value());

        if(!isAuthorized){
            throw new Exception("Transaction Unathorized!!");
        }

        Transaction newTransaction = new Transaction();
        newTransaction.setPayer(newTransaction.getPayer());
        newTransaction.setPayee(newTransaction.getPayee());
        newTransaction.setValue(newTransaction.value());
        newTransaction.setTimestamp(LocalDateTime.now());
    }

    public boolean authorizeTransaction(User payer, BigDecimal value){
        String url = "https://util.devi.tools/api/v2/authorize";
        ResponseEntity<Map> response = restTemplate.getForEntity(url, Map.class);
        if (response.getStatusCode().is2xxSuccessful() && response.getBody() != null) {
            Map<String, Object> body = response.getBody();
            return "success".equals(body.get("status")) && Boolean.TRUE.equals(body.get("authorization"));
        }
        return false;
    }
}
