package Machavaram_APCS_Receipt;

import java.util.Scanner;

public class Receipt
{
    public static void main(String[] args)
    {
       String Cookie;
       int numCookie;
       double priceCookie;
       Scanner order = new Scanner(System.in);
       System.out.println("Welcome to Chin-pie's cookie store.");
       System.out.println("Each individual cookie is 10 dollars.");
       System.out.println("We currently have the following: ");
       System.out.println("Chocolate chip");
       System.out.println("Which one would you like?");
       Cookie = order.nextLine();
       System.out.println("How many " + Cookie + " do you want?");
       numCookie = order.nextInt();
       priceCookie = numCookie * 10.00;
       System.out.println("The total amount your paying is $" + priceCookie + ". Have a good day!");
       priceCookie = order.nextDouble();


    }
}