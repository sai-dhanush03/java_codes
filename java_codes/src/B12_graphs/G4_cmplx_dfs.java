package B12_graphs;
import java.util.*;
// bfs and dfs for disjoint graphs

public class G4_cmplx_dfs {
    static class edge{
        int src;
        int dest;
        int wt;
        public edge(int s, int d, int w){
            src=s;
            dest=d;
            wt=w;
        }
    }

    public static void createGraph(ArrayList<edge> graph[]){            //graph is an array of array lists  
        for(int i=0;i<graph.length;i++){
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

        // 6 th vertex
        graph[6].add(new edge(6,7,1));
        // 7 th vertex
        graph[7].add(new edge(7,6,1));
    }

    public static void bfs(ArrayList<edge>[] graph){
        boolean vis[]=new boolean[graph.length];
        // System.out.println("gl"+graph.length);
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                bfsUtil(graph,vis,i);
            }
        }
    }

    public static void bfsUtil(ArrayList<edge>[] graph, boolean vis[],int k){
        Queue<Integer> q= new LinkedList<>();
        
        q.add(k);

        while(!q.isEmpty()){
            int curr=q.remove();
            // System.out.println(curr+"curr");
           

            if(!vis[curr]){
                System.out.println(curr);
                vis[curr]=true;
                for(int i=0;i<graph[curr].size();i++){
                    edge e=graph[curr].get(i);
                    q.add(e.dest);
                    // if(!vis[e.dest]){

                    //     q.add(e.dest);
                    // }
                }
            }
        }
    }

    public static void dfs(ArrayList<edge>[] graph){
        boolean[] vis= new boolean[graph.length];

        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                dfsutil(graph,i,vis);
            }
        }
    }

    public static void dfsutil(ArrayList<edge>[] graph, int curr, boolean[] vis){
        // int curr
        System.out.println(curr);
        vis[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                dfsutil(graph,e.dest,vis);
            }
        }

    }

        // O(V+E)
    // CYCLE DETECTION IN UNDIRECTED GRAPHS
    // public static boolean cycle(ArrayList<edge> graph[]){
    //     boolean vis[]=new boolean[graph.length];
    //     for(int i=0;i<graph.length;i++){
    //         if(!vis[i]){
    //             if(cycleutil(graph,vis,i,-1)){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

    // public static boolean cycleutil(ArrayList<edge> graph[],boolean vis[],int curr,int par){
    //      vis[curr]=true;
    //      for(int i=0;i<graph[curr].size();i++){
    //         edge e=graph[curr].get(i);

    //         // case 3
    //         if(!vis[e.dest] ){
    //             if(cycleutil(graph,vis,e.dest,curr)){
    //                 return true;    
    //             };
    //         }
    //         // if(!vis[e.dest] && cycleutil(graph,vis,e.dest,curr)){
    //         //     return true;
    //         // }
    //         // case 1
    //         else if(vis[e.dest] && e.dest!=par){
    //             return true;
    //         }

    //         // case 2 do ntng
    //      }
    //      return false;
    // }

    // public class Graph {
        public static int cycleLength(ArrayList<edge>[] graph) {
            int n = graph.length;
            boolean[] visited = new boolean[n];
            ArrayList<Integer> path = new ArrayList<>();
    
            for (int i = 0; i < n; i++) {
                if (!visited[i]) {
                    if (cycleUtil(graph, visited, i, -1, path)) {
                        // Cycle found, calculate length
                        int firstIndex = path.indexOf(path.get(path.size() - 1));
                        return path.size() - firstIndex;
                    }
                }
            }
            return -1; // No cycle found
        }
    
        public static boolean cycleUtil(ArrayList<edge>[] graph, boolean[] visited, int current, int parent, ArrayList<Integer> path) {
            visited[current] = true;
            path.add(current);
    
            for (edge e : graph[current]) {
                // If the neighbor is not visited, recurse
                if (!visited[e.dest]) {
                    if (cycleUtil(graph, visited, e.dest, current, path)) {
                        return true;
                    }
                }
                // If the neighbor is visited and not parent, cycle detected
                else if (e.dest != parent) {
                    return true;
                }
            }
            path.remove(path.size() - 1); // Backtrack
            return false;
        }

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
        // bfs(graph);
        // dfsutil(graph,0,new boolean[v]);
        // dfs(graph);
      
        System.out.println(  cycleLength(graph));


         
    }
}
// }
