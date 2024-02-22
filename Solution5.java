// Ques 5 :- Write a java program that takes the purchase amount as input and calculates
// the final payable amount after applying the discount.

// 1.) If the purchase amount is less than 500, no discount is applied.
// 2.) If the purchase amount is between 500 and 1000, a 10% discount is applied.
// 3.) If the purchase amount is greater than 1000 a 20% discount is applied.

package Task1_Day2;

import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {
        // Scanner to take input into console
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the purchase amount: ");
        int purchaseAmount = sc.nextInt();
        if(purchaseAmount <= 500){
            System.out.println("Final payable Amount: " +purchaseAmount);
        }else if(purchaseAmount > 500 && purchaseAmount <= 1000){
            // 10% of purchaseAmount = (purchaseAmount*10)/100
            System.out.println("Final payable Amount: " +(purchaseAmount -(purchaseAmount*10)/100));
        }else if (purchaseAmount > 1000) {
            // same formula for 20% Discount...
            System.out.print("Final payable Amount: " +(purchaseAmount -(purchaseAmount*20)/100));
        }else{
            // If user put any invalid data
            System.out.println("Enter a Valid Amount");
        }
        sc.close();
    }
}
