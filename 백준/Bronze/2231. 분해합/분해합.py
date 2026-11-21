# 1. 입력 받기 자연수 N
# 2. 1 ~ N-1 에서 분해합이 N이 되면 출력

N = int(input())

ans = 0
for n in range(1,N):
    part_sum = 0
    part_sum += n
    part_sum += sum(map(int, str(n)))

    if part_sum == N:
        ans = n
        break

print(ans)