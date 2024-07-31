package alpha_codes;
import java.util.Scanner;


public class A17_staircase_search {

    public static boolean staircasesearch(int matrix[][],int key){
        //top right
        // int row=0, col =matrix[0].length-1;
        // while(row<matrix.length && col>=0){
        //     if(matrix[row][col]==key){
        //         System.out.println("found key at:"+"("+ row+" , "+ col+")");
        //         return true;
        //     }

        //     else if(key<matrix[row][col]){
        //         col--;
        //     }

        //     else{
        //         row++;
        //     }

        // }
        // System.out.println("key not found");
        // return false;


       //bottom left
        int row=matrix.length-1, col=0;
        while(row>=0 && col<matrix[0].length){
            if(matrix[row][col]==key){
                System.out.println("found key at:"+row+","+col);
                return true;
            }
            else if(key > matrix[row][col]){
                col++;
            }
            else{
                row--;
            }
        }
        System.out.println("key not found:");
        return false;
        
    }
    public static void main(String[] args) {
        int matrix[][]={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter key to search in matrix:");
        int key=sc.nextInt();

        staircasesearch(matrix,key);
    }
}
