package pl.mkorcz.atm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class AtmApplication {

    public static void main(String[] args) {
        SpringApplication.run(AtmApplication.class, args);

        int balance = 0;
        int withdraw, deposit;



        while (true) {
            System.out.println("Welcome to your ATM: ");
            System.out.println("Please, choose the number: ");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check your account balance");
            System.out.println("4. EXIT");

			Scanner scanner = new Scanner(System.in);

			int n = scanner.nextInt();

            switch (n) {
                case 1:
                    System.out.println("How much money would you like to withdraw?");
                    withdraw = scanner.nextInt();
                    if (balance >= withdraw) {
                        balance -= withdraw;
                        System.out.println("Here's your money");
                    } else {
                        System.out.println("You don't have enough money to withdraw!");
                    }
                    break;
                case 2:
                    System.out.println("How much money would you like to put into your bank account?");
					deposit = scanner.nextInt();

					balance += deposit;
					System.out.println("added " + deposit + "$ to your bank account");
					System.out.println();
                    break;
                case 3:
                    System.out.println("checking");
                    break;
                case 4:
                    System.out.println("exit");
                    break;
            }
        }
    }

}
