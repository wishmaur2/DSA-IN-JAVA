

public class IsPowOfTwo04 {
    public static Boolean IsPowOf2(int n ){
    
        return (n&(n-1))==0;
    }
    public static void main(String args[]) {
        
        System.out.println(IsPowOf2(16));
        

    }
    
}
