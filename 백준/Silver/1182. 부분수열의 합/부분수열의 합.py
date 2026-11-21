N,S=map(int, input().split())
nums = list(map(int, input().split()))

sum = 0
cnt = 0

def dfs(depth, sum):

    global cnt
    if depth == N:
        if sum == S:
            cnt += 1
        return

    dfs(depth+1, sum) # 선택안함
    dfs(depth+1, sum + nums[depth]) # 선택함

dfs(0, sum)

# 아무것도 선택안 할 경우 제외
if S==0:
    cnt-=1

print(cnt)