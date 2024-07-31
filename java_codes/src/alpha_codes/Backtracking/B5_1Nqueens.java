package alpha_codes.Backtracking;
// print sol exist or not if yes print one sol.

public class B5_1Nqueens {
    public static boolean isSafe(char board[][],int row, int col){
        // vertical up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }

        }
        // up right diag
        for(int i=row-1, j=col-1;i>=0&&j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
            
        }
        // up left diag
        for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;

    }
    public static boolean nqueens(char board[][],int row){
        // base case
        if(row==board.length){
            // printboard(board);//to get the chess boards
            // count++;//to count no.of ways
            return true;
        }
        // recursion(column loop)
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){

                board[row][j]='Q';
                if(nqueens(board,row+1)){
                    return true;
                };//fun call
                board[row][j]='.';//backtracking step
            }


        }
        return false;

    }

    public static void printboard(char board[][]){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("---------chess board----------");
    }

    static int count=0;
    public static void main(String[] args) {
        int n=4;
        char board[][]=new char[n][n];
        // initaialize
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        if(nqueens(board,0)){
            System.out.println("sol is possible");
            printboard(board);
        }
        else{
            System.out.println("sol not possible");

        }
        // System.out.println("Total no.of ways to solve n queens ="+count);
    }
    
}
