import math

def solution(n):
    if(n==0):
        answer = -1
        
    
    if n // math.sqrt(n) == math.sqrt(n):
        #answer = (math.sqrt(n)+1)*(math.sqrt(n)+1)
        answer = (math.sqrt(n)+1)**2
    else:
        answer = -1
        
    return answer