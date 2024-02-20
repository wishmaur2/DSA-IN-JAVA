//For a given String convert each the first letter of eacg words to uppercase:
// "hi, i am wish maur "

public class ConvertUppercase07 {

    //O(n)
    static String ToUpperCase(String str){
        StringBuilder sb=new StringBuilder("");
            
        //Character.toUpperCase() is inbuild function in java use for convert a lower character into Upper Character.
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));

            }
            else{
                sb.append(str.charAt(i));
            }
        }
        // sb.toString() function is use to convert StringBuilder into String
        return sb.toString();
    }
    public static void main (String args[]){

        String st="hi, i am wish maur";
        System.out.print(ToUpperCase(st));

    }
    
}
