package practice;

import java.util.*;

public class L_time {
    public static void convert(String str) {
        String zone = str.substring(8, 10);
        String temp = str.substring(0, 2);
        int start = Integer.parseInt(temp);
        String ans;
        String s = "AM";
        if (s.equals(zone)) 
        {
            if (start != 12) 
            {
                System.out.println(str.substring(0, 8));
            } 
            else 
            {
                // ans = str.replaceAll(temp, "00");
                String c="0";
                ans=c+c+str.substring(2,10);
                System.out.println(ans.substring(0, 8));
            }
        } 
        else 
        {
            if(start!=12)
            {
                start = start + 12;
                String um = Integer.toString(start);
                ans=um+str.substring(2,8);
                System.out.println(ans);
                
            }
            else
            {
                System.out.println(str.substring(0, 8));
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        convert(str);
    }
}
