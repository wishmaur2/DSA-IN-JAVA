
public class OddEven02 {
    public static void OddOrEven(int n){
        int BitMask=1;
        if((n&BitMask)==1){
            System.out.println("Number is Odd");
        }
        else{
            System.out.println("Number is Even");
        }

    }
    public static void main (String args[]){
        OddOrEven(100);


    }
}
