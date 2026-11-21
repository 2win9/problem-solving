from collections import *

dr = [0,-1,0,1]
dc = [-1,0,1,0]

N,M = map(int, input().split()) # (0,0) -> (N,M)
grid = [list(map(int, input())) for _ in range(N)] # 0: 벽

visited = [[False]*M for _ in range(N)]

def bfs(r,c):
    q = deque()
    q.append((r,c,1))
    visited[r][c] = True

    while q:
        r,c,cnt = q.popleft()
        if r==N-1 and c==M-1:
            print(cnt)
            break
        for i in range(4):
            nr = r + dr[i]
            nc = c + dc[i]
            if nr<0 or nc<0 or nr>=N or nc>=M or visited[nr][nc] or grid[nr][nc] == 0:
                continue
            q.append((nr,nc,cnt+1))
            visited[nr][nc] = True

bfs(0,0)