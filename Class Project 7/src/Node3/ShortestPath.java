package Node3;

import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class ShortestPath { 

    void printSolution(int distance[]) 
    { 
        System.out.println("Vertex \t\t Distance from Source"); 
        for (int i = 0; i < vertex; i++) 
            System.out.println(i + " \t\t " + distance[i]); 
    } 
  
    public static void main(String[] args) 
    { 

        int graph[][] = new int[][] { { 0, 10, 5, 0, 0 }, 
						            { 0, 0, 2, 1, 0 }, 
						            { 0, 3, 0, 6, 2 }, 
						            { 0, 0, 0, 0, 4 }, 
						            { 7, 0, 0, 6, 0 }};
						                       
        ShortestPath t = new ShortestPath(); 
        t.dijkstra(graph, 0); 
    } 
    
    void dijkstra(int graph[][], int source) 
    { 
        int distance[] = new int[vertex]; 
  
        Boolean set[] = new Boolean[vertex]; 
  
        for (int i = 0; i < vertex; i++) { 
            distance[i] = Integer.MAX_VALUE; 
            set[i] = false; 
        } 
  
        distance[source] = 0; 
  
        for (int count = 0; count < vertex - 1; count++) { 
            int u = minDistance(distance, set); 
  
            set[u] = true; 

            for (int v = 0; v < vertex; v++) 
  
                if (!set[v] && graph[u][v] != 0 && distance[u] != Integer.MAX_VALUE && distance[u] + graph[u][v] < distance[v]) 
                	distance[v] = distance[u] + graph[u][v]; 
        } 
  
        printSolution(distance); 
    }
    
    static int vertex = 5; 
    int minDistance(int distance[], Boolean set[]) 
    { 
        int min = Integer.MAX_VALUE, min_index = -1; 
  
        for (int v = 0; v < vertex; v++) 
            if (set[v] == false && distance[v] <= min) { 
                min = distance[v]; 
                min_index = v; 
            } 
  
        return min_index; 
    } 
} 
