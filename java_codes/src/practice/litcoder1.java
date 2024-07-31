package practice;

import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayList;

public class litcoder1
{
    public static Stack<Integer> s1=new Stack<>();
    public static Stack<Integer> s2=new Stack<>();

    public static void enqueue(int x)
    {
        while(!s1.isEmpty())
        {
            s2.push(s1.pop());
        }
        s1.add(x);
        while (!s2.isEmpty()) 
        {
            s1.push(s2.pop());
        }
    }

    public static void dequeue()
    {
       s1.pop();
    }

    public static void print() 
    {
    System.out.println(s1.peek());
    }


    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        String in=sc.nextLine();
        sc.close();
        ArrayList<Integer> temp=new ArrayList<>();
        temp.add(0);
        for(int i=0;i<in.length();i++){
            if(in.charAt(i)==','){
                temp.add(i+1);
            }
        }
        while(!temp.isEmpty())
        {
            int idx=temp.remove(0);
            if(in.charAt(idx)=='1')
            {
                int st=idx+2;
                int ei=temp.get(0)-1;
                int val=Integer.parseInt(in.substring(st, ei));
                enqueue(val);
            }
            else if(in.charAt(idx)=='2')
            {
                dequeue();
            }
            else if(in.charAt(idx)=='3')
            {
                print();
            }
        }
        
    }
    
}
