package practice;


import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayList;



public class litcoder {

    static class queue {

        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty() {
            return s1.isEmpty();
        }

        public static void enqueue(int data) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            s1.push(data);

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        public static int dequeue() {
            return s1.pop();
        }

        public static void print() {
            System.out.println(s1.peek());
        }

    }

    public static void main(String[] args) {
        queue q = new queue();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // 1 42,2,1 14,3
        // 0123456789
        sc.close();
        ArrayList<Integer> a = new ArrayList<>();
        a.add(0);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ',') {
                a.add(i + 1);

            }
        }
        while (!a.isEmpty()) {
            int x = a.remove(0);
            if (s.charAt(x) == '1') {
                int st = x + 2;
                int ei=a.get(0)-1;
                int val=Integer.parseInt(s.substring(st, ei));
                // String a=s.charAt(st);
                // int val = Character.getNumericValue(s.charAt(st));

                // System.out.println(val);
                q.enqueue(val);

            } else if (s.charAt(x) == '2') {
                q.dequeue();
            } else if (s.charAt(x) == '3') {
                q.print();
            }

        }

    }

}
