package alpha_codes;

import java.util.*;

public class A15_spiralmatrix {
    public static void printspiral(int matrix[][]){
        int startrow=0;
        int startcol=0;
        int endrow=matrix.length-1;
        int endcol=matrix[0].length-1;

        while(startrow<=endrow && startcol<=endcol){
            // top
            for(int j=startcol; j<=endcol; j++){
                System.out.print(matrix[startrow][j]+" ");
            }

            // right
            for(int i=startrow+1;i<=endrow;i++){
                System.out.print(matrix[i][endcol]+" ");
            }

            // bottom
            for(int j=endcol-1;j>=startcol;j--){
                if(startrow==endrow){
                    break; 
                }
                System.out.print(matrix[endrow][j]+" ");
            }

            // left
            for(int i=endrow-1; i>=startrow+1; i--){
                if(startcol==endcol){
                    break; 
                }
                System.out.print(matrix[i][startcol]+" ");
            }

            startrow++;
            startcol++;
            endrow--;
            endcol--;

        }
        System.out.println();

    }
    public static void main(String[] args) {
        // int m,n;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("no.of rows:");
        // m=sc.nextInt();
        // System.out.println("No.of cols:");
        // n=sc.nextInt();
        // System.out.println("Elements");
        // int[][] matrix=new int[m][n];
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         matrix[i][j]=sc.nextInt();
        //     }
        // }

        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         System.out.print(matrix[i][j]+"  ");
        //     }
        //     System.out.println();
        // }

        int matrix[][]={{1,2,3,4},
                       {5,6,7,8},
                       {9,10,11,12},
                       };
     printspiral(matrix);
    }
}
