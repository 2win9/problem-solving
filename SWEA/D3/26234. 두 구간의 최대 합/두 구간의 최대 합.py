T=int(input())
for test_case in range(1,T+1):
    N,K = map(int, input().split())
    arr = list(map(int, input().split())) # 2 4 3 -4 6 1

    # 누적합 계산
    prefix = [0]*(N+1)
    for i in range(N):
        prefix[i+1] = prefix[i] + arr[i]

    ans = float('-inf')

    left_sum = 0
    for left_idx in range(N-2*K+1):
        left_sum = prefix[left_idx+K]-prefix[left_idx]
        right_idx = N-K
        while left_idx + K <= right_idx:
            right_sum = prefix[right_idx + K] - prefix[right_idx]
            right_idx -= 1
            ans = max(ans, left_sum + right_sum)

    print(f"#{test_case} {ans}")