package alpha_codes;

import java.util.Scanner;

public class A15a_spiral {
    public static void printspiral(int matrix[][]){
        int sr=0;
        int sc=0;
        int er=matrix.length-1;
        int ec=matrix[0].length-1;

        while(sr<=er && sc<=ec){
            // top
            for(int j=sc;j<=ec;j++){
                System.out.print(matrix[sr][j]+" ");
            }

            // right
            for(int i=sr+1;i<=er;i++){
                System.out.print(matrix[i][ec]+" ");
            }

            // bottom
            for(int j=ec-1;j>=sc;j--){
                System.out.print(matrix[er][j]+" ");
                if(sr==er){
                    break;
                }
            }

            // left
            for(int i=er-1;i>=sr+1;i--){
                System.out.print(matrix[i][sc]+" ");
                if(sc==ec){
                    break;
                }
            }
            sc++;
            sr++;
            ec--;
            er--;
        }

    }
    public static void main(String[] args) {
        int m,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("no.of rows:");
        m=sc.nextInt();
        System.out.println("No.of cols:");
        n=sc.nextInt();
        System.out.println("Elements");
        int matrix[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }

        // int matrix[][]={{1,2,3,4},
        //                {5,6,7,8},
        //                {9,10,11,12},
        //                {13,14,15,16}};
     printspiral(matrix);
    }
}
