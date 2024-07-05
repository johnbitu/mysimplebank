package dev.simple.bank.models;

import jakarta.persistence.*;


@Entity
@Table(name = "user_type")
public class UserType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    public UserType(){}

    public UserType(Long id, String description) {
        this.id = id;
        this.description = description;
    }
    /*Getters e Setters*/
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public enum Enum{
        USER(1L, "user"),
        MERCHANT(2L, "merchant");

        Enum(Long id, String description) {
            this.id = id;
            this.description = description;
        }

        private final Long id;
        private final String description;

        public UserType get(){
            return new UserType(id, description);
        }
    }
}