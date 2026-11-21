N=int(input())
roads = list(map(int, input().split()))
cities = list(map(int, input().split()))
cost = 0

min_value = cities[0]

for i in range(N-1):
    if min_value > cities[i]:
        min_value = cities[i]
    cost += (roads[i] * min_value)

print(cost)


# 1. 현재 주유소 비용이 min 일때 까지 전 도로까지 가는 비용만 구매
# 2. 주유소 순회하면서 min갱신되면 그떄부터 그 값으로 구매