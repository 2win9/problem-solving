from collections import *

N, M, V = map(int, input().split())
graph = [[] for _ in range(N+1)]

for _ in range(M):
    node1, node2 = map(int, input().split())
    graph[node1].append(node2)
    graph[node2].append(node1)
# [[],[2,3,4],[1,4],[1,4],[1,2]]

for neighbors in graph:
    neighbors.sort()

visited = [False] * (N+1)
def dfs(node):
    visited[node] = True
    print(node, end =' ')

    for next_node in graph[node]:
        if not visited[next_node]:
            dfs(next_node)

def bfs(node):
    visited = [False] * (N+1)
    q = deque()
    q.append(node)
    visited[node] = True

    while(q):
        next_node = q.popleft()
        print(next_node, end=' ')

        for x in graph[next_node]:
            if not visited[x]:
                visited[x] = True
                q.append(x)


dfs(V)
print()
bfs(V)