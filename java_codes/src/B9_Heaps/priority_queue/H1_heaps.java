package B9_Heaps.priority_queue;
import java.util.*;

public class H1_heaps {
    static class Heap{
        ArrayList<Integer> arr=new ArrayList<>();

        // ***********INSERT IN A HEAP*************** 

        public void add(int data){
            // add at last idx
            arr.add(data);

            int x=arr.size()-1;//x is child idx
            int parent=(x-1)/2;//parent is parent idx

            while(arr.get(x)<arr.get(parent)){//O(log n) no.of levels 
                // swap
                int temp=arr.get(x);
                arr.set(x,arr.get(parent));
                arr.set(parent,temp);

                x=parent;
                parent=(x-1)/2;

            }

        }

        private void heapify(int i){//O(log n)
            int left=2*1+1;
            int right=2*i+2;
            // int minidx=Math.min(i,Math.min(left,right));
            int minidx=i;
            if(left<arr.size() && arr.get(minidx)>arr.get(left)){
                minidx=left;
            }
            if(right<arr.size() && arr.get(minidx)>arr.get(right)){
                minidx=right;
            }

            if(minidx!=i){
                // swap
                int temp=arr.get(i);
                arr.set(i,arr.get(minidx));
                arr.set(minidx,temp);

                heapify(minidx);
            }


        }

        public int peek(){
            return arr.get(0);
        }

        public int remove(){
            int data=arr.get(0);

            // swap 1st and last
            int temp=arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);

            // delete last
            arr.remove(arr.size()-1);

            // heapify
            heapify(0);
            return data;



        }

        public boolean isEmpty(){
            return arr.size()==0;
        }
    }


    public static void main(String[] args) {

        Heap h=new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while(!h.isEmpty()){//heap sort-O(nlogn)
            System.out.println(h.peek());
            h.remove();

        }

        // if i want to convert it into for max heap just change the sign > to < in 3 places
        
    }
}
