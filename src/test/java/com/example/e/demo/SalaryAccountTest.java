package com.example.e.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryAccountTest {
    @Test
    void withdraw() {
        SavingsAccount savingsAccount=new SavingsAccount(100,"Jakup",1500);
        SavingsAccount savingsAccount1=new SavingsAccount(101,"Artim",500);
        assertEquals(15.0,savingsAccount.withdraw(750));
        assertEquals(10.0,savingsAccount1.withdraw(500));

    }

}