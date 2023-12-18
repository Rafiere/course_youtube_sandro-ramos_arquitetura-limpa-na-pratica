package dev.piccodev.domain.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/* Represents a QRCode. */
public class PixDTO {

    private String id;
    private BigDecimal amount;
    private String email;
    private String description;
    private String emv;
    private String base64;
    private LocalDateTime expiration;

    private PixDTO(String id, BigDecimal amount, String email, String description, String emv, String base64, LocalDateTime expiration) {
        this.id = id;
        this.amount = amount;
        this.email = email;
        this.description = description;
        this.emv = emv;
        this.base64 = base64;
        this.expiration = expiration;
    }

    public static PixDTO of(String id, BigDecimal amount, String email, String description, String emv, String base64, LocalDateTime expiration) {
        return new PixDTO(id, amount, email, description, emv, base64, expiration);
    }

    public String getId() {
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

    public void setId(String id) {
        this.id = id;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEmv(String emv) {
        this.emv = emv;
    }

    public void setBase64(String base64) {
        this.base64 = base64;
    }

    public void setExpiration(LocalDateTime expiration) {
        this.expiration = expiration;
    }
}
