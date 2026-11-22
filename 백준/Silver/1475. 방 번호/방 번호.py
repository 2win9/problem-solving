# 1. 숫자 입력받기
# 2. 0~9 배열 만들어서 한글자씩 넣기.
# 3. 6이랑 9 숫자 맞추기
# 4. 최댓값 카운트
N=input()
nums = [0]*10

for n in N:
    if n=='6' or n=='9':
        if nums[6] > nums[9]:
            nums[9] += 1
        else:
            nums[6] += 1
    else:
        nums[int(n)] += 1

print(max(nums))