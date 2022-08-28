package com.example.e.demo;

public abstract class Account {
    //krijimi i variablave
    private int id;
    private String ownerName;
    private double balance;

    //krijimi i konstruktorit per inicializimin e klases
    public Account(int id, String ownerName, double balance) {
        this.id = id;
        this.ownerName = ownerName;
        this.balance = balance;
    }
    //metoda toString per printim
    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", ownerName='" + ownerName + '\'' +
                ", balance=" + balance +
                '}';
    }
    //geters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    //krijimi i metodes deposit
    void deposit(double amount) {
        double newBalance = balance + amount;
        this.balance = newBalance;
    }
//krijimi i metodes withdraw
    double withdraw(double amount) {
        double newBalance = balance - amount;
        this.balance = newBalance;
        return newBalance;
    }
}

