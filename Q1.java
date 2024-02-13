package PracticalQuestion;
/* 
Print the number of 7’s that are inthe 2d array.
Example :
Input - int[][] array = { {4,7,8},{8,8,7} };
Output - 2

*/

public class Q1 {
    public static void countNumber(int matrix[][]){
        int count=0;
        for(int i=0; i<matrix.length;i++){
          for(int j=0;j<matrix[0].length;j++){
            if(matrix[i][j]==7){
              count++;
            }
          }
        }
        System.out.println(count);
    }

    public static void main(String args[]){
        int[][] array = { {4,7,8},
                          {8,8,7} };
        
        countNumber(array);
    }
    
}
