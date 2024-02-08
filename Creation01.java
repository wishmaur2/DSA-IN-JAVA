import java.util.*;

public class Creation01 {

    static boolean Search(int matrix [][], int key){
        for(int i=0; i<matrix.length;i++){
            for(int j=0; j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("Key is found at cell ( "+ i +","+j+")");
                    return true;           

                }
            }
            
            
        }
        System.out.println("Key is not found ");
        return false;


    }

    static void show (int matrix[][]){
        for(int i=0; i<matrix.length;i++){
            for(int j=0; j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
            
        }

    }

    public static void main(String args[]) {
        int matrix[][] = new int[2][3];

        Scanner s = new Scanner(System.in);
        

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = s.nextInt( );
                
            }
        }
        s.close();

        show(matrix);
        Search(matrix,6);

    }
}