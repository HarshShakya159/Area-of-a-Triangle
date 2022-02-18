/*
Harsh Shakya    
Computer Science Grade 12
Feb 11th, 2022
AREA OF TRIANGLE
*/
package TriangleHarsh;

import java.util.Scanner; // Import command to ask for input through normal line code.

public class TriangleHarsh {
    public static void main(String[] args) {


        double a, b, c; // Variables for all sides of the scalene triangle
        double answer; // Variable for the final answer
        
        
        Scanner userinput = new Scanner (System.in); // Scanner command for the user to input their value
       
        System.out.println("--------------------------------");
        System.out.println("AREA OF A SCALENE TRIANGLE BY Harsh Shakya");

        System.out.print("Please enter an value for Side A: "); // Prompt the user to input their value for A
        a = userinput.nextDouble();
        System.out.println("--------------------------------");
       
        System.out.print("Please enter an value for Side B: "); // Prompt the user to input their value for B
        b = userinput.nextDouble();
        System.out.println("--------------------------------");

        System.out.print("Please enter an value for Side C: "); // Prompt the user to input their value for C
        c = userinput.nextDouble();
        System.out.println("--------------------------------");

        answer = (a + b + Math.sin(c)) / 2; // Trigonometric Formula for the area
        System.out.println("The area of this scalene triangle is: " + answer); // Display the final results
        System.out.println("--------------------------------");

    

    }

}
