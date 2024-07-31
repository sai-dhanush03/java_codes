package alpha_codes;
import java.util.*;

public class A21_shortest_path {
     public static float getshrtstpath(String path){
        int x=0,y=0;
        for(int i=0; i<path.length(); i++){
            char dir=path.charAt(i);
            if(dir=='S'){
                y--;
            }
            else if(dir=='N'){
                y++;
            }
            else if(dir=='E'){
                x++;
            }
            else if(dir=='W'){
                x--;
            }
        }
        int X2=x*x;
        int Y2=y*y;
        return (float)Math.sqrt(X2+Y2);
     }

     public static void main(String[] args) {
        String path="WNEENESENNN";
        
        System.out.println(getshrtstpath(path));
        // System.out.println("sai");
     }
}
