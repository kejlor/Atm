package com.company;

public class Atm{

    public static void withdrawMoney(int moneyToWithdraw, BankAccount loggedUser){

        if(loggedUser.getAccountBalance() - moneyToWithdraw >= 0){
            loggedUser.setAccountBalance(loggedUser.getAccountBalance() - moneyToWithdraw);
            System.out.println("Money are getting printed by ATM and your current " +
                    "bank accout equals: " + loggedUser.getAccountBalance());
        }
        else {
            System.out.println("Not enough currency on your account!");
        }
    }

    public static void deposit(int moneyToDeposit, BankAccount loggedUser){
        loggedUser.setAccountBalance(loggedUser.getAccountBalance() + moneyToDeposit);
        System.out.println("Your bank account contains now:" + loggedUser.getAccountBalance());
    }
}
