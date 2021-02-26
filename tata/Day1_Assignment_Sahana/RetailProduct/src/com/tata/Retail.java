package com.tata;
import java.util.Scanner;

public class Retail {

    public static void main(String[] args) {
        float total = 0;
        int ch;
        int qty;
        Scanner sc = new Scanner(System.in);



        System.out.println("Product 1 - Rs 22.50");

        System.out.println("Product 2 - Rs 44.50");

        System.out.println("Product 3 - Rs 9.98");

        System.out.println("4-Exit program");

        while (true) {

            System.out.print("Enter the product number: ");

            ch = sc.nextInt();
            if(ch==4){
                System.out.println("Thank you for shopping");
                break;
            }


                System.out.print("Enter quantity sold: ");
                qty = sc.nextInt();

            switch (ch) {

                case 1:
                    total += 22.50 * qty;
                    break;

                case 2:
                    total+= 44.50 * qty;
                    break;

                case 3:
                    total += 9.98 * qty;
                    break;

                default:
                    total+= 0;
                    break;
            }

            System.out.println("The retail value of selected products: " + total);
        }

        System.out.println("The Total Retail value of the Products sold: " + total);

    }
}
