from collections import deque

T = int(input())
dr = [0, -1, 0, 1] # 서 북 동 남
dc = [-1, 0, 1, 0]

def bfs(r, c):
    q = deque()
    q.append((r,c))
    visited[r][c] = True

    while(q):
        r,c = q.popleft()

        for d in range(4):
            nr = r + dr[d]
            nc = c + dc[d]
            if nr<0 or nc<0 or nr>=N or nc>=M or visited[nr][nc] == True or grid[nr][nc] == 0:
                continue
            q.append((nr,nc))
            visited[nr][nc] = True

for _ in range(T):

    M,N,K = map(int, input().split()) # 가로, 세로, 배추개수
    visited = [[False] * M for _ in range(N)]
    grid = [[0] * M for _ in range(N)]
    for _ in range(K):
        c, r = map(int, input().split())
        grid[r][c] = 1

    count = 0
    for r in range(N):
        for c in range(M):
            if grid[r][c] == 1 and not visited[r][c]:
                bfs(r, c)
                count += 1

    print(count)
