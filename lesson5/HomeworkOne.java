

    /* Currency Exchange: Declare an int variable usDollars representing a certain amount in US dollars.
    Convert this amount to Canadian dollars using an exchange rate (e.g., 1 USD = 1.25 CAD)
    and store the result in a double variable canadianDollars.
    Print the result. */



package lesson5;
    
    import java.util.Scanner;

    public class HomeworkOne {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.print("Please enter a value in USD: ");
            int usDollars = in.nextInt();

            double canadianDollars = ((double)usDollars * 1.25);

            System.out.print( usDollars + " in CAD is: " + canadianDollars);
    
}
    }