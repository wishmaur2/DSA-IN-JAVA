public class substring05 {

    static String substring(String str,int si, int ei){
        String substr="";
        for(int i=si;i<=ei;i++){
            substr+=str.charAt(i);
        }

        return substr;
    }


    public static void main(String args[]){
        String  str="HelloWorld";
        

        //function call
        System.out.print(substring(str,1,5));


         System.out.println();
        // inbuild method
        // str.substring(0, 0)
        System.out.print(str.substring(0, 5));

            
        
    }
    
}
