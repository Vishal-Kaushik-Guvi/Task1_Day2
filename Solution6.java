// Ques 6 :- Write a Java program to print the bellowed pattern.

// 5 5 5 5 5
// 5 4 4 4 4
// 5 4 3 3 3 
// 5 4 3 2 2
// 5 4 3 2 1

package Task1_Day2;

public class Solution6 {
    public static void main(String[] args) {
       int n=5;
        for(int i=1; i<=5; i++){
            System.out.print(5);
            for(int j=1; j<5; j++){
                System.out.print(n);  
            }
            --n;
            System.out.println();
        }
    }
}
