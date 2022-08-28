package com.example.e.demo;

import java.util.ArrayList;
import java.util.List;

public class AccountTestWithMainMethod {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(100, "Jakup", 500);
        SalaryAccount salaryAccount = new SalaryAccount(101, "Artim", 500);
        List<Account> accountList = new ArrayList<Account>();
        accountList.add(savingsAccount);
        accountList.add(salaryAccount);
        salaryAccount.deposit(500);
        salaryAccount.withdraw(750);

        savingsAccount.deposit(500);
        savingsAccount.withdraw(750);
        for (Account ac : accountList) {
            System.out.println(ac);
        }
    }
}
