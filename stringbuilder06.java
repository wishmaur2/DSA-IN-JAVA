

public class stringbuilder06 {
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("");
        

        //O(26) 
        for(char ch='a';ch<='z';ch++){
            // .append() function use in stringbuilder for adding
            sb.append(ch);
        }
        System.out.print(sb);
        System.out.println();
        System.out.print(sb.length());
    }
    
}
