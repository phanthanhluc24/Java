package QLSV.OOP;

import java.util.Scanner;

public class BankAccount {
    private String accountNumber;
    public String accountHolder;
    protected double balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    protected void displayAccountInfo() {
        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("| %-15s | %-15s | %-4s |\n", "Full Name", "Number Account", "Balance");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("| %-15s | %-15s | %-4s |\n", this.accountHolder, this.accountNumber, this.balance);
        System.out.println("-----------------------------------------------------------------------------");
    }

    protected double deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
        return this.balance;
    }

    protected double withdraw(double amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
        }
        return this.balance;
    }

    public static void main(String[] args) {
        BankAccount bank = new BankAccount("0825030247", "Phan Thanh Luc", 8000);
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("""
                    --- Nhap So De Thuc Hien---
                    1. Xem thong tin
                    2. Xem so du
                    3. Rut tien
                    4. Nap tien
                    ---- Vui Long Nhap So ----
                    """);
            int option = input.nextInt();
            double amount;
            switch (option) {
                case 1:
                    bank.displayAccountInfo();
                    break;
                case 2:
                    bank.getBalance();
                    System.out.println("So du trong tai khoan cua ban la: " + bank.getBalance());
                    break;
                case 3:
                    System.out.println("Nhap so tien ban muon rut: ");
                    amount = input.nextDouble();
                    bank.withdraw(amount);
                    System.out.println("So du trong tai khoan cua ban la: " + bank.getBalance());
                    break;
                case 4:
                    System.out.println("Nhap so tien ban muon nap: ");
                    amount = input.nextDouble();
                    bank.deposit(amount);
                    System.out.println("So du trong tai khoan cua ban la: " + bank.getBalance());
                    break;
                default:
                    break;
            }
        }
    }

}
