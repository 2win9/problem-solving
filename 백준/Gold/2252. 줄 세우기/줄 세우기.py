from collections import deque

N,M = map(int, input().split())
graph = [[] for _ in range(N+1)]
indegree = [0]*(N+1)

for _ in range(M):
    node1, node2 = map(int, input().split())
    graph[node1].append(node2) # node1 뒤에 서야 하는 학생 추가
    indegree[node2] += 1 # node2보다 앞에 서야 하는 학생 수

q = deque()
for student in range(1, N+1):
    if indegree[student] == 0:
        q.append(student)

order = []
while q:
    student = q.popleft()
    order.append(student)

    for next_student in graph[student]:
        indegree[next_student] -= 1

        if indegree[next_student] == 0:
            q.append(next_student)

print(*order)