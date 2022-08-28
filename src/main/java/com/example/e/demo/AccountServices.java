package com.example.e.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountServices {
    private static Map<Integer,AccountInput> accountInputMap=new HashMap<>();
    private static int index=2;
    static {
        AccountInput accountInput1=new AccountInput(101,"Account1",500);
        AccountInput accountInput2=new AccountInput(102,"Account2",1000);
        AccountInput accountInput3=new AccountInput(103,"Account3",1550);
        accountInputMap.put(0,accountInput1);
        accountInputMap.put(1,accountInput2);
        accountInputMap.put(2,accountInput3);
    }
    public static List<AccountInput> getAllAccount(){
        return new ArrayList<>(accountInputMap.values());
    }
    public static AccountInput getAccountDetails(Integer accountOwnerId){
        return accountInputMap.get(accountOwnerId);
    }

    public static AccountInput addAccount(AccountInput accountInput){
        index+=1;
        accountInput.setId(index);
        accountInputMap.put(index,accountInput);
        return accountInput;
    }
}
