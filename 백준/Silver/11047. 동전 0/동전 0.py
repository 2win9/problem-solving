N, K = map(int, input().split())
coins = []
cnt = 0
for _ in range(N):
    coins.append(int(input()))

coins.sort(reverse=True)
for coin in coins:
    if K == 0:
        break

    if K//coin > 0:
        cnt += K//coin
        K %= coin

print(cnt)