// Question 2: In a program, input the side of a square. You have to output the area of the square.
// (Hint : area of a square is (side x side))

import java.util.Scanner;

public class Q2 {
    public static void main (String args[]){
    
        System.out.println("Enter the Size ");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
    
        System.out.println("area of a square is "+ a*a);

        s.close();
        
    
    }
}
