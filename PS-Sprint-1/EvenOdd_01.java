// Determining Even/Odd Numbers
// Difficulty: Easy
// Topics: Basic Programming
// Description: Write a program to check whether a number is even or odd.
// Example:
// Input: number = 4
// Output: Even
// Explanation: Since 4 is divisible by 2, it is an even number.

import java.util.Scanner;

/**
 * EvenOdd_01
 */
public class EvenOdd_01 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int i = scn.nextInt();

        if( i != 0 && i % 2 != 0){
            System.out.println( i + " is Odd");
        }else{
            System.out.println( i + " is Even");
        }

        scn.close();
    }
}