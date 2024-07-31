package alpha_codes;

public class A32_interface {

    public static void main(String[] args) {
        queen q=new queen();
        q.moves(); 
        
    }
}

interface chessplayer{
    void moves();
}

class queen implements chessplayer{
    public void moves(){
        System.out.println("up,down,left,ri8,diagonal");
    }
}

class rook implements chessplayer{
    public void moves(){
        System.out.println("up , down, left , ri8");
    }
}