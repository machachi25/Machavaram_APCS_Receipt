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
       System.out.println("Which one would you like?");
       Cookie = order.nextLine();
       System.out.println("How many " + Cookie + " do you want?");
       numCookie = order.nextInt();


    }
}