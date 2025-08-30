package org.example.collections;

public class Banking {

    private double balance;

    public Banking(int initialBalance){
        this.balance = initialBalance;
    }

    public Banking(){
        this.balance = 0;
    }

    public void deposit(double balance){
        if(balance >= 0){
            this.balance = balance;
        }else{
            System.out.println("Insufficient funds");
        }
    }

    public void withdraw(double balance){
        if(balance <= this.balance){
            this.balance -= balance;
        }
    }
    public double getBalance(){
        return this.balance;
    }
}
