package B2_Array_list;
import java.util.ArrayList;
// container with most water

public class A9_container_water {
    // brute force O(n^2)
    public static int storewater(ArrayList<Integer> height){
        int max=0;
        for(int i=0;i<height.size();i++){

            for(int j=i+1;j<height.size();j++){
                int ht=Math.min(height.get(i),height.get(j));
                int width=j-i;
                int water=ht*width;
                if(max<water){
                    max=water;
                
                }

            }
        }
        return max;

            
    }

    // 2 pointer approach O(n)
    public static int store_water(ArrayList<Integer> height){
        int maxwtr=0;
        int lp=0;//left pntr
        int rp=height.size()-1;

        while(lp<rp){
            // calc water area
            int width=rp-lp;
            int ht =Math.min(height.get(lp),height.get(rp));
            int curr_wtr=width*ht;
            maxwtr=Math.max(curr_wtr,maxwtr);

            // update pntr
            if(height.get(lp)<height.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxwtr;
    }


    public static void main(String[] args) {
        
        ArrayList<Integer> height= new ArrayList<>();
        //1 8 6 2 5 4 8 3 7

        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        
        // System.out.println(max);
        // System.out.println(line1+line2);
        // System.out.println(storewater(height));//brute force
        System.out.println(store_water(height));

            
        
      
        
    }
}
