//Question 1 : In a program, input 3 numbers : A, B and C. You have to output the average of these 3 numbers.
// (Hint : Average of N numbers is sum of those numbers divided by N)

import java.util.Scanner;

public class Q1 {
    public static void main (String args[]){
    
        System.out.println("Enter First No.");
        Scanner s1=new Scanner(System.in);
        int a=s1.nextInt();
        System.out.println("Enter Second No.");
        Scanner s2=new Scanner(System.in);
        int b=s2.nextInt();
        System.out.println("Enter Third No.");
        Scanner s3=new Scanner(System.in);
        int c=s3.nextInt();

        int avg=a+b+c/3;
        System.out.println("AVG Of Three NO. "+ avg);
        

    }
    
}
