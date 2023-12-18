package dev.piccodev.domain.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

/* The BO doesn't have setters. */
public class PixBO {

    private UUID id;
    private BigDecimal amount;
    private String email;
    private String description;
    private String emv;
    private String base64;
    private LocalDateTime expiration;

    public PixBO(String id, BigDecimal amount, String email, String description, String emv, String base64, LocalDateTime expiration) {
        this.id = id != null ? UUID.fromString(id) : UUID.randomUUID();
        this.amount = amount;
        this.email = email;
        this.description = description;
        this.emv = emv;
        this.base64 = base64;
        this.expiration = expiration;

        //We should to validate the Business Object with our rules.
        validate();
    }

    public void validate(){
        //TODO: To be implemented.
    }

    public void updateEmvData(String emv, String base64, LocalDateTime expiration){
        this.emv = emv;
        this.base64 = base64;
        this.expiration = expiration;
    }

    public UUID getId() {
        return id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getEmail() {
        return email;
    }

    public String getDescription() {
        return description;
    }

    public String getEmv() {
        return emv;
    }

    public String getBase64() {
        return base64;
    }

    public LocalDateTime getExpiration() {
        return expiration;
    }
}
