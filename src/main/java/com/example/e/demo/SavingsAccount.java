package com.example.e.demo;

public class SavingsAccount extends Account {
    //konstruktor per inicializim te klases
    public SavingsAccount(int id, String ownerName, double balance) {
        //keywordi super eshte per shkak se ka inheritanc pi klases Account dhe i barten variablat e klases Account
        super(id, ownerName, balance);
    }

    static final int FEE = 2;

    //kjo oshte override per shkak se eshte e trasheguar pi klases Account
    @Override
    void deposit(double amount) {
        double balanceeee = amount + getBalance();
        System.out.println(getOwnerName() + "deposited " + amount);
        System.out.println("Balance after deposit is: " + balanceeee);
        setBalance(balanceeee);
    }

    //kjo oshte override per shkak se eshte e trasheguar pi klases Account
    @Override
    double withdraw(double amount) {
        double amountttt = (amount * FEE) / 100;
        double amountt = getBalance() - amount - amountttt;


        System.out.println("withdrawn: " + amount);
        System.out.println("balance after withdrawl is: " + amountt);
        setBalance(amountt);
        //kjo
        return (int) amountttt;
    }
}
