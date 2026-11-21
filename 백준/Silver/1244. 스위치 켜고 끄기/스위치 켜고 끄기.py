N=int(input()) # 스위치 수
switches = [0] + list(map(int, input().split())) # 스위치 상태 index = 1부터, 0은 무시
M=int(input()) # 학생 수

def change_switch(idx):
    if switches[idx] == 0:
        switches[idx] = 1
    else:
        switches[idx] = 0

for _ in range(M):
    sex, num = map(int, input().split()) # 남 1 여 2
    step = num
    if sex == 1:
        # 여기에 남자
        while(num <= N):
            change_switch(num)
            num += step

    else:
        # 여기에 여자
        step = 1
        change_switch(num)
        while(num-step > 0 and num+step <= N):
            if switches[num-step] != switches[num+step]:
                break
            else:
                change_switch(num-step)
                change_switch(num+step)
            step += 1

# 출력
cnt = 0
for i in range(1, N+1):
    if cnt//20 >= 1 and cnt%20 == 0:
        print()
    print(switches[i], end=' ')
    cnt += 1
