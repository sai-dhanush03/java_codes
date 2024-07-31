package alpha_codes;

public class A38_duplicates_in_stng {
    public static void removeDuplicate(String str, int idx, StringBuilder newstr, boolean map[]){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }

        // kaam
        char currchar=str.charAt(idx);
        if(map[currchar-'a']==true){
            // duplicate
            removeDuplicate(str,idx+1,newstr,map);

        }
        else{
            map[currchar-'a']=true;
            removeDuplicate(str,idx+1,newstr.append(currchar),map);
        }
    }

    public static void main(String[] args) {
        String str="dhanushhhhhhhhhhz";
        StringBuilder sb=new StringBuilder("");
        boolean bool[]= new boolean[26];
        removeDuplicate(str,0,sb,bool);

        // or
        removeDuplicate(str,0,new StringBuilder(""),new boolean[26]);
    }
    
}
