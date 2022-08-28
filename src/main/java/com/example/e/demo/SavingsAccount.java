package com.example.e.demo;

public class SavingsAccount extends Account{
    public SavingsAccount(int id, String ownerName, double balance) {
        super(id, ownerName, balance);
    }
    static final int FEE=2;
    @Override
    void deposit(double amount) {
        double balanceeee=amount+getBalance();
        System.out.println(getOwnerName()+"deposited "+amount);
        System.out.println("Balance after deposit is: "+balanceeee);

        setBalance(balanceeee);
    }
    @Override
    double withdraw(double amount) {
        double amountttt=(amount*FEE)/100;
        double amountt=getBalance()-amount-amountttt;


        System.out.println("withdrawn: "+amount);
        System.out.println("balance after withdrawl is: "+amountt);
        setBalance(amountt);
        return  (int)amountttt;
    }
}
