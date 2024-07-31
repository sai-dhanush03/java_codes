package B4_Stacks;
import java.util.Stack; 

public class S11_histogram_area {
    public static void histogram_maxarea(int arr[]){ //O(n) TIME COMPLEXITY
        int maxArea=0;
        int nsr[]=new int[arr.length];
        int nsl[]=new int[arr.length];
        // next smaller right O(n)
        Stack<Integer> s= new Stack<>();

        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty()&&arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=arr.length;
                // -1
            }else{
                // top
                nsr[i]=s.peek();
            }
            s.push(i);
        }


        //  next smaller left O(n)
          s= new Stack<>();

        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty()&&arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=-1;
                // -1
            }else{
                // top
                nsl[i]=s.peek();
            }
            s.push(i);
        }

        // curr area width=j-i-1 O(n)
        for(int i=0;i<arr.length;i++){
            int height=arr[i]; 
            int width=nsr[i]-nsl[i]-1;
            int currarea=height*width; 
            maxArea=Math.max(currarea,maxArea);

        }
        System.out.println("Max area is histogram is :"+maxArea);
    }
     public static void main(String[] args) {
        int arr[]={2,1,5,6,2,3};//heights of histogram
        histogram_maxarea(arr);


     }
}
