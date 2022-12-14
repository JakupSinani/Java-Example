package com.example.e.demo.controller;

import com.example.e.demo.SpringBootMethod.AccountInput;
import com.example.e.demo.SpringBootMethod.AccountServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GetPutController {
    @GetMapping("/get")
    public List<AccountInput> getAllAccount() {
        return AccountServices.getAllAccount();
    }

    @GetMapping("account/{accountId}")
    public AccountInput getAccountDetails(@PathVariable int accountId) {
        return AccountServices.getAccountDetails(accountId);
    }

    @PostMapping("/addAccount")
    public AccountInput addAccount(@RequestBody AccountInput accountInput) {
        return AccountServices.addAccount(accountInput);
    }
}
