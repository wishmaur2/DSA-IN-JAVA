//Check if a String is Palindrome: racecar, noon, madam; 

public class palindrome02{

    static boolean IsPalindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                System.out.print("Not a Palindrome");
                return false;

            }
        }
        System.out.print(" Palindrome");
        return true;
    }
    public static void main(String args[]){
        String str="racecar";

        IsPalindrome(str);

    }

}