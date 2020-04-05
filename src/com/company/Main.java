package com.company;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        BankAccount kejlor = new BankAccount("kejlor", "kejlor", 1000);

        Atm.withdrawMoney(500, kejlor);

        System.out.println(kejlor.getAccountBalance());

        Atm.deposit(1000, kejlor);

        System.out.println(kejlor.getAccountBalance());
    }

}