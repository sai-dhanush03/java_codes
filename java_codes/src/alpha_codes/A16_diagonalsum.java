package alpha_codes;

public class A16_diagonalsum {

    public static int diagonalsum(int matrix[][]){
        int sum=0;

        // // O(n^2)time cmplxty
        // for(int i=0; i<matrix.length;i++){
        //     for(int j=0; j<matrix[0].length; j++){
        //         if(i==j){
        //             sum+=matrix[i][j];
        //         }
        //         else if(i+j==matrix.length-1){
        //             sum+=matrix[i][j];
        //         }
        //     }

        // }
        for(int i=0; i<matrix.length; i++){
            // primry diag
            sum+=matrix[i][i];
            // scndry diag
            if(i!=matrix.length-i-1){//becoz i should not eql to j as it is already added in primary diag

                sum+=matrix[i][matrix.length-i-1];
            }
        }
        System.out.println(sum);
        return sum;
        

    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                       {5,6,7,8},
                       {9,10,11,12},
                       {13,14,15,16}};
        diagonalsum(matrix);
        
    }
}
