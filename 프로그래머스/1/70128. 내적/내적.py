def solution(a, b):
    answer = 0
    length=len(a)
    for i in range(length):
        x=a[i]*b[i]
        answer+=x
        
        
    return answer