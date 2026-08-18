import java.io.*;
import java.util.Scanner;

interface BankingServices {
    void deposit(double amount);
    void withdraw(double amount);
    void checkBalance();
}

class Bank implements BankingServices {
    double balance;

    Bank(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }

    void saveToFile() {
        try {
            FileWriter fw = new FileWriter("bank.txt");
            fw.write("Balance: " + balance);
            fw.close();
        } catch (IOException e) {
            System.out.println("File error");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bank account = new Bank(1000);

        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");

        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter amount: ");
            account.deposit(sc.nextDouble());
        } else if (choice == 2) {
            System.out.print("Enter amount: ");
            account.withdraw(sc.nextDouble());
        } else if (choice == 3) {
            account.checkBalance();
        } else {
            System.out.println("Invalid choice");
        }

        account.saveToFile();
        sc.close();
    }
}
