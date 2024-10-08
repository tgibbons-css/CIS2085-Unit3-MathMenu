package math;

import java.util.Scanner;

public class Math
{
    public static void main(String[] args)
    {
        // Menu item constants.
        final int ADD = 1;
        final int SUBTRACT = 2;
        final int MULTIPLY = 3;
        final int DIVIDE = 4;
        final int QUIT = 5;
        int x = 10;
        
        // Welcome user and get initial number.
        System.out.println("Welcome!  This program will allow you to perform several mathematical operations.");
        System.out.print("What number would you like to start with? ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        
        // Display menu and get user's menu choice.
        System.out.println();
        System.out.println("--- MATH MENU ---");
        System.out.println("1. Add 100.");
        System.out.println("2. Subtract 50.");
        System.out.println("3. Multiply by 2.");
        System.out.println("4. Divide by 3.");
        System.out.println("5. Quit.");
        System.out.print("What operation would you like to perform? ");
        int choice = input.nextInt();
        
        if(choice == ADD)
        {
            // Add 100 and display current number.
            number += 100; // number = number + 100;
            System.out.println("Adding 100.");
        }
        else if(choice == SUBTRACT)
        {
            // Subtract 50 and display current number.
            number -= 50;
            System.out.println("Subtracting 50.");
        }
        else if(choice == MULTIPLY)
        {
            // Multiply by 2 and display current number.
            number *= 2;
            System.out.println("Multiplying by 2.");
        }
        else if(choice == DIVIDE)
        {
            // Divide by 3 and display current number.
            number /= 3;
            System.out.println("Dividing by 3.");
        }
        else if (choice == QUIT)
        {
            System.out.println("You chose to quit.");
        }
        else
        {
            // The user chose an invalid option.  Tell him/her and display current number.
            System.out.println("Error, invalid menu option.");
        }
        
        // Display final number to user.
        System.out.println();
        System.out.println("Your final number is " + number + ". Have a great day!");
    }
}
