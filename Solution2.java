// Ques 2 :- Write a program to find a given number is Negative or Positive.

package Task1_Day2;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args){
    // Declare a Scanner class to get input in Console..
        Scanner sc =new Scanner(System.in);
        System.out.print("Give the Number: ");
        int num = sc.nextInt();
    // condition to check if given number is greater than zero because all positive numbers are greater than zero
        if(num>0){
            System.out.println("Number is Positive ");
        }else{
            System.out.println("Number is Negative ");
        }
        sc.close();
    }
}
