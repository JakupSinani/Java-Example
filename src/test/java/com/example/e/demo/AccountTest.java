package com.example.e.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {


    @Test
    void withdraw() {
        SavingsAccount savingsAccount=new SavingsAccount(100,"Jakup",1500);
        SalaryAccount salaryAccount=new SalaryAccount(101,"Artim",500);
        assertEquals(15.0,savingsAccount.withdraw(750));
        assertEquals(2.5,salaryAccount.withdraw(500));

    }
}