import sys

N = int(input()) 
req = list(map(int, input().split()))
M = int(input()) 

left = 0
right = max(req)
answer = -1

while left <= right:
    mid = (left+right) // 2 
    
    sum = 0
    for i in range(N):
        sum += min(mid, req[i])
    if sum <= M:
        answer = mid # 답이 될 수 있음
        left = mid + 1
    else:
        right = mid - 1

print(answer)