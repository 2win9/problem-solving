# 모든 로프를 사용해야 할 필요는 없으며, 임의로 몇 개의 로프를 골라서 사용해도 된다.
# ex) 5 10 15 15 20 / w: 30
from collections import *;

N=int(input())
lst = []

for _ in range(N):
    lst.append(int(input()))

lst.sort()

ropes=deque()
for i in range(N):
    ropes.append(lst[i])

weights = []

while(ropes):
    weights.append(ropes[0] * len(ropes))
    ropes.popleft()

print(max(weights))