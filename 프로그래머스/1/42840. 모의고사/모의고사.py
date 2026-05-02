def solution(answers):
    answer = []
    i=0
    
    scores=[0, 0, 0] # 점수

    # 1. 수포자 패턴
    s1=[1,2,3,4,5]
    s2=[2,1,2,3,2,4,2,5]
    s3=[3,3,1,1,2,2,4,4,5,5]
    
    # 2. 채점
    while True:
        if i == len(answers):
            break
        
        
        if s1[i % len(s1)] == answers[i%len(answers)]:
            scores[0]+=1
        
        if s2[i % len(s2)] == answers[i%len(answers)]:
            scores[1]+=1
        
        if s3[i % len(s3)] == answers[i%len(answers)]:
            scores[2]+=1
        
        i += 1
        
    # 3. 집계

    if max(scores) == scores[0]:
        answer.append(1)
    
    if max(scores) == scores[1]:
        answer.append(2)
        
    if max(scores) == scores[2]:
        answer.append(3)
        
    answer.sort()
    
    return answer