package B2_Array_list;
import java.util.ArrayList;

public class A7_MultiDimensi {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        mainList.add(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3); list2.add(4);
        mainList.add(list2); 

        for(int i=0; i<mainList.size();i++){
            ArrayList<Integer> currlist= mainList.get(i);
            for(int j=0; j<currlist.size(); j++){
                System.out.print(currlist.get(j)+" ");

            }
            System.out.println();  
        }
        System.out.println(mainList);

    }
}
