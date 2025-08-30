package org.example.collections;

public class CollectionsDemo {

    public static void main(String[] args) {
        Banking banking = new Banking();
        System.out.println("Initial Balance"+banking.getBalance());
        banking.deposit(1000);
        System.out.println("After deposit : "+banking.getBalance());
        banking.withdraw(500);
        System.out.println("After withdraw : "+banking.getBalance());
    }
}
