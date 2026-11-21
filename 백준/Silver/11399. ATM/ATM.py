N = int(input())
line = list(map(int, input().split()))

line.sort()
part_sum = []
sum_value = 0
for i in range(N):
    sum_value += line[i]
    part_sum.append(sum_value)

ans = sum(part_sum)
print(ans)