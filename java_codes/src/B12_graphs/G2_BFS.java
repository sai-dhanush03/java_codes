// BFS      DFS     HASPATH

package B12_graphs;
import java.util.*;

public class G2_BFS {
    static class edge{
        int src;//source
        int dest;
        int wt;
        public edge(int s,int d,int w){
            // this.src=s;
            src=s;
            this.dest=d;
            this.wt=w;
        }
    }

    public static void bfs(ArrayList<edge>[] graph){//BFS is similar to level order O(n) linear time

        // O(V+E) edges or vertices which are more 
        Queue<Integer> q= new LinkedList<>();
        boolean[] visited=new boolean[graph.length];
        q.add(0); //src=0

        while(!q.isEmpty()){
            int curr=q.remove();

            if(!visited[curr]){  //visit curr
                System.out.println(curr);
                visited[curr]=true;
                // adding neighbours to Q
                for(int i=0;i<graph[curr].size();i++){
                    edge e=graph[curr].get(i);
                    q.add(e.dest);
                }

            }
        }


    }  
    
    
    public static void dfs(ArrayList<edge>[] graph, int curr, boolean vis[]){//O(V+E)
        // visit
        System.out.println(curr+" ");
        vis[curr]=true;


        for(int i=0;i<graph[curr].size();i++){
            edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                dfs(graph,e.dest,vis);
            }
        }
    }

    public static boolean hasPath(ArrayList<edge>[] graph,int src, int dest, boolean[] vis){
        // O(V+E)
        if(src==dest){
            return true;
        }
        vis[src]=true;

        for(int i=0;i<graph[src].size();i++){
            edge e=graph[src].get(i);
            // e.dest is neigbour
            if(!vis[e.dest] && hasPath(graph, e.dest, dest, vis)){
                return true;
            }
        }

        return false;
    }



    public static void main(String[] args) {
        /*
         *           (5)
         *        0------- 1
         *                / \
         *          (1)  /   \  (3)
         *      5-------2----3
         *              |  (1)
         *          (2) |
         *              4
         * 
         * 
         */
        int v=6;
        // int arr[]=new int[n]
        ArrayList<edge> graph[]=new ArrayList[v];

        for(int i=0;i<v;i++){
            graph[i]=new ArrayList<>();
        }

        //0 vertex
        graph[0].add(new edge(0,1,5)); 

        // 1 vertex
        graph[1].add(new edge(1,0,5));
        graph[1].add(new edge(1,2,1));
        graph[1].add(new edge(1,3,3));

        // 2vertex
        graph[2].add(new edge(2,1,1));
        graph[2].add(new edge(2,3,1));
        graph[2].add(new edge(2,4,2));
        graph[2].add(new edge(2,5,2));

        //3 vertex
        graph[3].add(new edge(3,1,3));
        graph[3].add(new edge(3,2,1));

        //4 vertex
        graph[4].add(new edge(4,2,2));

        // 5 vertex
        graph[5].add(new edge(5,2,1));


        // // to get 2's neighbors
        // for(int i=0; i<graph[2].size();i++){
        //     edge e=graph[2].get(i); //src, dest,wt 
        //     System.out.println(e.dest) ;
        // }

        // bfs(graph);
        // dfs(graph,0,new boolean[v]);
        System.out.println(hasPath( graph, 0, 51, new boolean[v] ));

    }
}
