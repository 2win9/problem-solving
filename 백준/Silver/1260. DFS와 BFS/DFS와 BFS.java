import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    static int[] visited;
    static int[][] graph;
    static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); // 노드 개수
        int M = sc.nextInt(); // 링크 개수
        int V = sc.nextInt(); // 탐색을 시작 번호

        // 인접 행렬 선언
        graph = new int[N+1][N+1];
        visited = new int[N+1];

        // 간선이 연결 할 두 정점의 번호
        for(int i=0; i<M; i++){
            int src = sc.nextInt();
            int dst = sc.nextInt();

            // 연결 하기 (무방향 그래프)
            graph[src][dst] = 1;
            graph[dst][src] = 1;
        }

        // DFS 탐색
        dfs(V);
        System.out.println();
        // BFS 탐색
        visited = new int[N+1];
        bfs(V);
    }

    static void dfs(int node){
        visited[node] = 1;
        System.out.print(node +" ");

        for(int i=1; i<=N; i++){
            if(graph[node][i] == 1 && visited[i] == 0){
                dfs(i);
            }
        }
    }

    static void bfs(int node){
        Queue <Integer> q = new LinkedList<>();
        q.add(node);

        while(!q.isEmpty()){
            int now = q.poll();
            visited[now] = 1;
            System.out.print(now+" ");

            for(int i=1; i<=N; i++){
                if(graph[now][i] == 1 && visited[i] == 0){
                    q.add(i);
                    visited[i] = 1;
                }
            }
        }
    }
    
}
