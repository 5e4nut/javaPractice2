package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Practice 2, Variant 5, Fedorov Ivan, RIBO-01-21");

        System.out.println("Enter name of your store: ");
        String storeName = scanner();
        System.out.println("Enter the location of your store: ");
        String storeLocation = scanner();
        System.out.println("Enter the amount of goods in your store: ");
        int goodsAmount = Integer.parseInt(scanner());
        System.out.println("Enter the type of goods: ");
        String goodsType = scanner();
        System.out.println("Enter tax rate: ");
        int taxRate = Integer.parseInt(scanner());

        LegalStore myStore = new LegalStore(storeName, storeLocation, goodsAmount, goodsType, taxRate);

        System.out.println("Enter the amount of workers: ");
        int workersAmount = Integer.parseInt(scanner());
        myStore.setWorkersAmount(workersAmount);
        System.out.println("Enter the workers salary: ");
        int salary = Integer.parseInt(scanner());
        myStore.setSalary(salary);
        System.out.println("Enter the total income: ");
        int totalIncome = Integer.parseInt(scanner());
        myStore.setTotalIncome(totalIncome);

        myStore.getAll();
    }

    private static String scanner() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
