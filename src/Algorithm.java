import edu.uci.ics.jung.graph.UndirectedSparseMultigraph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import static java.lang.System.out;

 class Algorithm{
    /* static private ArrayList<Integer>[] toAlgorithm(ArrayList<Integer>[] weight){
         ArrayList<Integer>[] wa=new ArrayList[weight.length];
         for (int i=0;i<weight.length;i++){
             wa[i]=new ArrayList<Integer>();
         }
         for (int i=0;i<weight.length;i++){
             for (int j=0;j<weight[i].size();j++){
                 wa[i].add(weight[i].get(j));
                 wa[j].add(weight[i].get(j));
             }
         }
         return wa;
     }*/
    //BFS
    static boolean bfs(ArrayList<Integer>[] graph, int start) {
        boolean visit[] = new boolean[graph.length];
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(start);
        visit[start] = true;
        while (!q.isEmpty()) {
            int temp = q.poll();
            visit[temp] = true;
            for (int i = 0; i < graph[temp].size(); i++) {
                if (!visit[graph[temp].get(i)])
                    q.add(graph[temp].get(i));
            }
        }
        int i = 0;
        while (i < visit.length) {
            if (visit[i] == false)
                return false;
            i++;
        }
        return true;
    }

    //algorithm Dijksta's
    static int [] dijkstra(ArrayList<Integer>[] graph, ArrayList<Integer>[] weight, int start) {
        boolean[] visit = new boolean[graph.length];
      //  ArrayList<Integer>[] weight=toAlgorithm(weight2);
        int[] dist = new int[graph.length];
        int [] root=new int[graph.length];
        for (int i = 0; i < dist.length; i++) {
            if (i != start) {
                dist[i] = Integer.MAX_VALUE;
            }
            else {
                dist[i] = 0;
            }
        }
        //decision
        for (int iterator = 0; iterator < graph.length; iterator++) {
            int temp=-1;
            double tempresult=Double.POSITIVE_INFINITY;

            for (int i = 0; i < visit.length; i++) {
                if (visit[i]) {
                    continue;
                }
                if (dist[i]<tempresult){
                    temp=i;
                    tempresult=dist[i];
                }
            }

            visit[temp] = true;
            for (int i = 0; i < graph[temp].size(); i++) {
                    if ((weight[temp].get(i) + dist[temp]) < dist[graph[temp].get(i)]) {
                        dist[graph[temp].get(i)] = dist[temp] + weight[temp].get(i);
                        root[graph[temp].get(i)]=temp;
                }
            }
        }
        return root;
    }

}
