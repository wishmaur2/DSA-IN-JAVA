public class DiagonalSum03 {

    public static void DiagonalSumPrint(int matrix[][]){
        int sum=0;

        //1   O(n^2)
        for(int i=0; i<matrix.length;i++){
            for(int j=0; j<matrix[0].length;j++){       //Primary D.
                if(i==j){
                    sum+=matrix[i][j];               
                }
                else if(i+j==matrix.length-1){         //Secodary D.
                    sum+=matrix[i][j];
                }
            }
        }

        //2   O(n)
        for(int i=0;i<matrix.length;i++){
            //Primary D. ->i==j
            sum+=matrix[i][i];

            //Secodary D. ->i+j==matrix.length-1
            if(i!=matrix.length-1-i){
                sum+=matrix[i][matrix.length-1-i];
            }
        }
        System.out.println(sum);

    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        
        // int matrix1[][]={{1,2,3,4},
        //                 {5,6,7,8}};

        // int matrix2[][]={{1,2,3,4,5},
        //                 {6,7,8,9,10},
        //                 {11,12,13,14,15},
        //                 {16,17,18,19,20},
        //                 {21,22,23,24,25}};




        DiagonalSumPrint(matrix);
        // DiagonalSumPrint(matrix1);
        // DiagonalSumPrint(matrix2);

    }
  

}
