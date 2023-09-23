package io.github.lucianodacunha.screenmatch.desafio.model;

import com.github.javafaker.Faker;

public class CreditCard {
    private String number;
    private Double limit;
    private Double invoice;
    private Double balance;
    public CreditCard(){
        this.number = new Faker().finance().creditCard();
        this.limit = new Faker().number().randomDouble(2, 1000, 50000);
        this.invoice = new Faker().number().randomDouble(2, 1000, this.limit.intValue());
        this.balance = limit - invoice;
    }

    public CreditCard(String number, Double limit){
        this.number = number;
        this.limit = limit;
    }

    public CreditCard(String number, Double limit, Double balance){
        this.number = number;
        this.limit = limit;
        this.invoice = balance;
    }

    public String getNumber(){
        return this.number;
    }

    public Double getLimit(){
        return this.limit;
    }

    public Double getInvoice(){
        return this.invoice;
    }

    public void setInvoice(Double value){
        this.invoice += value;
        this.calculateBalance();
    }

    private void calculateBalance(){
        this.balance = this.limit - this.invoice;
    }

    public Double getBalance(){
        return this.balance;
    }

    public String toString(){
        System.out.printf(
                "%-25s  %-8s  %-8s  %-8s",
                "NUMBER", "LIMIT", "INVOICE", "BALANCE\n");
        return String.format(
                "%-25s  %8.2f  %8.2f  %8.2f",
                getNumber(), getLimit(), getInvoice(), getBalance()
        );
    }
}