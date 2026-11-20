N = int(input())
F = int(input())


str_num = str(N)
ans = ''

N = (N // 100) * 100
while(True):
    if N%F == 0:
        str_num = str(N)
        if str_num == 1:
            ans = ans + '0'
        else:
            ans = ans + str_num[-2] + str_num[-1]
        break
    N += 1


print(ans)