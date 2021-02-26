package com.tata;


import java.util.Scanner;

public class WorkerApp {
    public static void main(String[] args)
    {   Scanner sc = new Scanner(System.in);
        Worker d=new Daily();
        System.out.println("Enter the name of daily worker: ");
        d.setName(sc.next());
        System.out.println("Enter per day wage of daily worker: ");
        d.setSalrate(sc.nextFloat());
        System.out.println("Enter the number of days: ");
        d.Pay(sc.nextInt());
        Worker s = new Salaried();
        System.out.println("Enter the name of the SalariedWorker: ");
        s.setName(sc.next());
        System.out.println("Enter per hour wage of salaried worker: ");
        s.setSalrate(sc.nextFloat());
        s.Pay(40);
    }
}
