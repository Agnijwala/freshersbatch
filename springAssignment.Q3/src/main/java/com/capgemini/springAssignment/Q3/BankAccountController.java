package com.capgemini.springAssignment.Q3;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class BankAccountController extends BankAccount{

	public BankAccountController(long accountId, String accountHolderName, String accountType, long accountBalance) {
        super(accountId, accountHolderName, accountType, accountBalance);
    }
    public double withdraw(long accountId, double balance){
    return 0;
    }
    public double deposit(long accountId, double balance){
        return 0;
    }
    public double getBalance(long accountId){
        return 0;
    }
    public boolean fundTransfer(long fromAccount, long toAccount){
        return false;
    }


}
