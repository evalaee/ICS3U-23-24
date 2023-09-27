package lesson4;

public class ExampleThree {
    int mark1 = 84, mark2 = 91, mark3 = 97;
        int numTests = 3;

        // Three types of Errors:

        // LOGIC ERRORS: Program runs, doesn't crash but you don't get the expected output
        double average = mark1 + mark2 + mark3 / (double)numTests;


        // RUNTIME ERRORS: Runs but crashes when it is running eg: divide by 0
        int number = 7 / 0;


        // SYNTAX ERRORS: Won't run (compile), red swuiggle, error in the java code, forgetting a "" or ;
        System.out.println("Hello World);
}
