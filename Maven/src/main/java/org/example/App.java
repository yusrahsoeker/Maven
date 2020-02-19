package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.print("Enter the first number: ");
        num1 = sc.nextInt();
        System.out.print("\nEnter the second number: ");
        num2 = sc.nextInt();

        System.out.println("\n" + num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
    }
}
