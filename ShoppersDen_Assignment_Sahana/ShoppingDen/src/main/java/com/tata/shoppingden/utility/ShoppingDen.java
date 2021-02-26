package com.tata.shoppingden.utility;

import java.sql.SQLException;
import java.util.Scanner;

public class ShoppingDen {
    public static void main(String[] args) throws SQLException {
        Scanner s = new Scanner(System.in);
        ShoppingAdmin shoppingAdmin =new ShoppingAdmin();
        ShoppingCustomer shoppingCustomer =new ShoppingCustomer();
        System.out.println("1. Admin");
        System.out.println("2. Customer");
        int userMode=s.nextInt();
        switch(userMode){
            case 1:
                String username,pwd;
                System.out.println("Enter username");
                username=s.nextLine();
                System.out.println("Enter password");
                pwd=s.nextLine();
                if(username.equals("admin") && pwd.equals("admin"))
                    shoppingAdmin.adminClass();
                break;
            case 2:
                shoppingCustomer.customerClass();
                break;

            default:
                System.out.println("Please Enter Valid Option..!");

        }
    }
}
