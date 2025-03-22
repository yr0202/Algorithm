from collections import deque

d = deque([])
N = int(input())

for i in range(1, N+1):
    d.append(i)

while len(d)>1:
    d.popleft()
    d.append(d.popleft())
    
print(d[0])