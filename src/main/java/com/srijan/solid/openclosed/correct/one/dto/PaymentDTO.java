package com.srijan.solid.openclosed.correct.one.dto;


public class PaymentDTO {
    private String name;
    private String bank;
    private double amount;

    public PaymentDTO(String name, String bank, Double amount) {
        this.name = name;
        this.bank = bank;
        this.amount = amount;
    }

    public PaymentDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
