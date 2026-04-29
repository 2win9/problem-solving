def solution(sizes):
    answer = 0
    depths=[] #큰쪽
    highs=[] #작은쪽

    
    #1. 최대값이 가로, 최소값이 세로
    for size in sizes:
        max_size=max(size)
        min_size=min(size)
        depths.append(max_size)
        highs.append(min_size)
    #2. 그중에서 최대값
    answer=max(depths)*max(highs)

    return answer 