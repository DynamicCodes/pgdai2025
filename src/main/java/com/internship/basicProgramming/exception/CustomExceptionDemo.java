package com.internship.basicProgramming.exception;

class InvalidBalanceException extends Exception {
    public InvalidBalanceException(String message) {
        super(message);
    }
}
// custom unchecked exception
class InsufficientFundsException extends RuntimeException {
    private double balance;
    private double amount;

    public InsufficientFundsException(double balance, double amount) {
        super("Insufficient funds!" + balance + ", attempted " + amount);
        this.balance = balance;
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public double getAmount() {
        return amount;
    }
}
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) throws InvalidBalanceException {
        if(initialBalance < 0) {
            throw new InvalidBalanceException("initial balance cannot be negative");
        }
        this.balance = initialBalance;
    }
    public void withdraw(double amount){
        if(amount > balance){
            throw new InsufficientFundsException(balance, amount);
        }
        balance -= amount;
        System.out.println("withdrawn: " + amount + " remaining funds " + balance);
    }
}



public class CustomExceptionDemo {
    public static void main(String[] args) throws InvalidBalanceException {
        try {
            BankAccount account = new BankAccount(1000);
            account.withdraw(2000); // will throw exception
        }catch (InvalidBalanceException e){
            System.out.println("Account creation error with 0 balance: " + e.getMessage());
        }catch (InsufficientFundsException e){
            System.out.println("Insufficient funds: " + e.getMessage());
        }
    }
}
