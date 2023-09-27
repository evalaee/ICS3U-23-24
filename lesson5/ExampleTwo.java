package lesson5;

import java.util.Scanner;

public class ExampleTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Prompt the user for a number.
        /* System.out.print("Please enter a number: ");
        int x = in.nextInt();

        System.out.println(x);

        System.out.println("Please enter a decimal number: ");
        double y = in.nextDouble();
        System.out.println(y);

        System.out.println("PLease enter two ints: ");
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println(a+b);
        */

        System.out.print("Please enter a number: ");    // If I give it two numbers seperated by a space
        int x = in.nextInt();
        System.out.print("Please enter another number: ");  // It takes the first and leaves the second for later
        int y = in.nextInt();

        System.out.println(x+y);
    }
}