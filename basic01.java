// import java.util.*;
//String is IMMUTABLE -->not changeble
public class basic01{

    public static void main (String args[]){
        // char c='a';
        // char arr[]={'a','b','c'};
        
     //Declare
        // String str="Wish";
        // String str2=new String("Wish");

        // System.out.println(str);
        // System.out.println(str2);

     // INPUT & OUTPUT
        // Scanner sc=new Scanner(System.in);
        // // String name=sc.next();
        // String name2=sc.nextLine();
        // // System.out.println(name);
        // System.out.println(name2);
        // sc.close();
    
     //String Length --> In string length is a function , not only property 
        // System.out.println(name2.length());

     //String Concatenation
        String fname="Wish";
        String lname="Maur";
        String Fname=fname+" "+lname;
        System.out.println(Fname);

     //charAt method call
         printletter(Fname);  


    }
    

    //charAt method
    public static void printletter(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }

}