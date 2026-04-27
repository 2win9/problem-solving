def solution(n):
    answer = 0
    str_n = str(n)
    answer = "".join(sorted(str_n, reverse=True))
    answer=int(answer)
    return answer