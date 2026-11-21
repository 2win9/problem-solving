N=int(input())
lst = []
ranks = [1] * N

for _ in range(N):
    weight, height = map(int, input().split()) # 몸무게, 키
    lst.append([weight, height])

for i in range(N):
    weight = lst[i][0]
    height = lst[i][1]
    for j in range(N):
        if weight < lst[j][0] and height < lst[j][1]:
            ranks[i] += 1

print(*ranks)