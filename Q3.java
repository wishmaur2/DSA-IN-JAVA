// Question 3: Enter cost of 3 items from the user (using float data type) - a pencil, a pen and an eraser. You have to output the total cost of the items back to the user as their bill.
// (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)

import java.util.*;

public class Q3 {
    public static void main (String args[]){
    
        System.out.println("Enter Pencil Price");
        Scanner s1=new Scanner(System.in);
        float a=s1.nextInt();
        System.out.println("Enter Pen Price");
        Scanner s2=new Scanner(System.in);
        float b=s2.nextInt();
        System.out.println("Enter Eraser Price");
        Scanner s3=new Scanner(System.in);
        float c=s3.nextInt();
        
        s1.close();
        s2.close();
        s3.close();

        float tot=a+b+c;
        float gst=(tot*18)/100;
        System.out.println("total cost of the items "+ tot);
        System.out.println("total cost of the items with gst "+(float) (tot+gst));
        

    }
    
    
}
