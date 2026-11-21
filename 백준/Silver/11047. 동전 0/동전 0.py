N, K = map(int, input().split())
coins = []
coin_count = 0
for _ in range(N):
    coins.append(int(input()))

coins.sort(reverse=True)
for coin in coins:
    if K == 0:
        break

    if K//coin > 0:
        coin_count += K//coin
        K %= coin

print(coin_count)