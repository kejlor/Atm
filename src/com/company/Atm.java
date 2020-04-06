package com.company;

public class Atm{

    private final BankAccount loggedUser;
    
    public Atm(final BankAccount loggedUser) {
        this.loggedUser = loggedUser;   
    }
    
    public void withdrawMoney(int moneyToWithdraw) {

        if(loggedUser.getAccountBalance() - moneyToWithdraw >= 0){
            loggedUser.setAccountBalance(loggedUser.getAccountBalance() - moneyToWithdraw);
            System.out.println("Money are getting printed by ATM and your current " +
                    "bank accout equals: " + loggedUser.getAccountBalance());
        }
        else {
            System.out.println("Not enough currency on your account!");
        }
    }

    public void deposit(int moneyToDeposit) {
        loggedUser.setAccountBalance(loggedUser.getAccountBalance() + moneyToDeposit);
        System.out.println("Your bank account contains now:" + loggedUser.getAccountBalance());
    }
}
