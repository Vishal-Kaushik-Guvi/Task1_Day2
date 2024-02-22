// Ques 4 :- Write a Java Program to find the smallest among three numbers.

package Task1_Day2;

import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        // Scanner to take input into console
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the Third Number: ");
        int num3 =  sc.nextInt();
       // conditon to check if num1 is smallest
        if(num1<num2 && num1<num3){
            System.out.println("First Number is the smallest");
      // conditon to check if num2 is smallest
        }else if (num2<num1 && num2<num3) {
            System.out.println("Second Number is the smallest");
      // conditon to check if num3 is smallest
        }else if (num3<num1 && num3<num2) {
            System.out.println("Third Number is the Smallest");
     // condition to check if two numbers are smallest than other one OR all the numbers are equal..
        }else{
            System.out.println("All the Numbers are Equal or Two of them are Equaly Smallest");
        }

        sc.close();
    }
}
