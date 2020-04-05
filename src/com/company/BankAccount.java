package com.company;

public class BankAccount {
    public String login;
    public String password;
    public int accountBalance;


    public BankAccount(String login, String password, int money){
        this.login = login;
        this.password = password;
        this.accountBalance = money;
    }

    void setLogin(String login){
        this.login = login;
    }

    void setPassword(String password){
        this.password = password;
    }

    void setAccountBalance(int accountBalance){
        this.accountBalance = accountBalance;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

}
