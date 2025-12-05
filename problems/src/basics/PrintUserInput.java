package basics;

import java.util.Scanner;

class Solution {
    // Function to take input and display output
    public void printNumber(Scanner sc) {

        // Take input
        int number = sc.nextInt();

        // Print output
        System.out.print(number);
    }
}

// Driver code
class Main {
    public static void main(String[] args) {
        // Creating an instance of Solution class
        Solution sol = new Solution();

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Function call to take input and display output
        sol.printNumber(sc);
    }
}