//Given an integer age, print on the screen:
//Adult if age >= 18
//Teen if age < 18
//Do not change the case of any letter in "Adult" and "Teen" while printing the answer.

package basics;

import java.util.Scanner;

class IfElseSolution {
    public void isAdult(int age) {
        // Your code goes here
        if(age >= 18){
            System.out.println("Adult");
        }else{
            System.out.println("Teen");
        }
    }
}

class IfElseMain {
    public static void main(String[] args) {
        // Creating an instance of PrintUserInput class
        IfElseSolution ifElseSolution = new IfElseSolution();

        // Take age as input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        /* Function call to check if the person
        is an adult or a teen */
        ifElseSolution.isAdult(age);
    }
}