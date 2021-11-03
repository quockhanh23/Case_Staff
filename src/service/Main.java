package service;

import models.Account;
import models.Staff;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        String passWord = scanner.nextLine();

        account.deleteAccount(userName, passWord);
    }
}
