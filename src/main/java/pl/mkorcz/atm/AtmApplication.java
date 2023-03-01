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


        boolean stayOrNot = true;
        while (stayOrNot) {
            System.out.println("\nWelcome to your ATM: ");
            System.out.println("Please, choose the number: ");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check your account balance");
            System.out.println("4. EXIT");

            Scanner scanner = new Scanner(System.in);

            String n = scanner.nextLine();

            switch (n) {
                case "1":
                    if (balance == 0) {
                        System.out.println("You don't have money to withdraw. Deposit first.");
                    } else {
                        System.out.println("How much money would you like to withdraw?");
                        withdraw = scanner.nextInt();
                        if (balance >= withdraw) {
                            balance -= withdraw;
                            System.out.println("Here's your money\n");
                        } else {
                            System.out.println("You don't have enough money to withdraw!\n");
                        }
                    }
                    break;

                case "2":
                    System.out.println("How much money would you like to put into your bank account?");
                    deposit = scanner.nextInt();

                    balance += deposit;
                    System.out.println("added " + deposit + "$ to your bank account\n");
                    break;

                case "3":
                    System.out.println("You have " + balance + " PLN in your bank account. Keep growing!");

                    break;

                case "4":
                    System.out.println("ByeBye");
                    stayOrNot = false;
                    break;
                default:
                    System.out.println("Sorry, You can use only numbers 1, 2, 3 or 4 to use this ATM. Please, try again.");

            }
        }
    }

}
