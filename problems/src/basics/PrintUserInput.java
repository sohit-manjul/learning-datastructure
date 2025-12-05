//Complete the function printNumber which takes an integer input from the user and prints it on the screen.

package basics;

import java.util.Scanner;

class PrintUserInput {
    // Function to take input and display output
    public void printNumber(Scanner sc) {

        // Take input
        int number = sc.nextInt();

        // Print output
        System.out.print(number);
    }
}

// Driver code
class PrintUserInputMain {
    public static void main(String[] args) {
        // Creating an instance of PrintUserInput class
        PrintUserInput sol = new PrintUserInput();

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Function call to take input and display output
        sol.printNumber(sc);
    }
}