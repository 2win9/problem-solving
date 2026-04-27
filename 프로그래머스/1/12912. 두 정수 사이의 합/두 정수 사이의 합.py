def solution(a, b):
    answer = 0
    c=0
    if a>b:
        c=b
        b=a
        a=c
    for i in range(a,b+1):
        answer += i
    return answer