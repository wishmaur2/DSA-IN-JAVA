//Given a route cantaining 4 directions (E,W,N,S)
//Find the shorted path to reach destination:
//   "WNEENESENNN"

public class shortestpath03{

    static float getShortestpath(String str){
        int x=0, y=0;
        for(int i=0;i<str.length();i++){
            char dir=str.charAt(i);
            
            //SOUTH
            if(dir=='S'){
                y--;

            }

            //NORTH
            if(dir=='N'){
                y++;
            }

            //WEST
            else if(dir=='W'){
                x--;
            }

            //EAST
            else if(dir=='E'){
                x++;
            }

           

           
        }

        int x2=x*x;
        int y2=y*y;

        return (float)Math.sqrt(x2+y2);  
    }
    public static void main(String args[]){
        String str="WNEENESENNN";

        
         System.out.print(getShortestpath(str));

    }

}