package B12_graphs;
import java.util.*;

public class G5_bipartite {
    static class edge{
        int src;
        int dest;
        edge(int s, int d){
            src=s;
            dest=d;
        }
    }
    public static void createGraph(ArrayList<edge> graph[]){            //graph is an array of array lists  
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
    
        //0 vertex
        graph[0].add(new edge(0,1)); 
    
        // 1 vertex
        graph[1].add(new edge(1,2));
        graph[1].add(new edge(1,0));
        // graph[1].add(new edge(1,3));
    
        // 2vertex
        graph[2].add(new edge(2,1));
        graph[2].add(new edge(2,4));
        graph[2].add(new edge(2,3));
        graph[2].add(new edge(2,5));
    
        //3 vertex
        // graph[3].add(new edge(3,1));
        graph[3].add(new edge(3,2));
        //4 vert
        graph[4].add(new edge(4,2));
        // 5 vert
        graph[5].add(new edge(5,2));
        // 6 th vert
        graph[6].add(new edge(6,7));
        // 7 th vert
        graph[7].add(new edge(7,6));
    }

    public static boolean isbipartite(ArrayList<edge> graph[]){
        int[] col=new int[graph.length];
        for(int i=0;i<graph.length;i++){
            col[i]=-1;
        }

        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<graph.length;i++){
            if(col[i]==-1){
                // do bfs
                q.add(i);
                col[i]=0;//yellow
                while(!q.isEmpty()){
                    int curr=q.remove();
                    for(int j=0;j<graph[curr].size();j++){
                        edge e=graph[curr].get(j);
                        if(col[e.dest]==-1){//no clr for neig
                            int nxtcol=col[curr]==0?1:0;
                            col[e.dest]=nxtcol;
                            q.add(e.dest);
                        }else if(col[e.dest]==col[curr]){
                            return false;//Not bipartite
                        }

                    }
                }
            }
        }
        return true;

    
    }
    // if graph doesnt have cycles then it is bipartite fo sure


    public static void main(String[] args) {
        int v=8;
        ArrayList<edge>[] graph=new ArrayList[v];
        createGraph(graph);
        /*
         *           (5)
         *        0------- 1
         *                / \                         (1)
         *          (1)  /   \  (3)                6-----7
         *      5-------2----3
         *              |  (1)
         *          (2) |
         *              4
         * 
         * 
         */
        System.out.println(isbipartite(graph));

}    
}
