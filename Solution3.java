// Ques 3 :- Write Down the program to reverse a given number using loops.

package Task1_Day2;

import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        // This variable used to denote the last digit of the given Number.
        int last_digit;
        int reverseNumber = 0;
        // Loop will ittrate until the given number will be 0;
        while (num != 0) {
            // It will give us last digit from the given number(num)..
            last_digit = num % 10;
            //This will attach the lastdigit at the end of reverseNumber.
            reverseNumber = reverseNumber * 10 + last_digit;
            //This will break the given number untill it becomes Zero and it also helps in making given number lose its last digt in each ittration.
            num = num / 10;
        }
        System.out.println(reverseNumber);
        sc.close();
    }
}
