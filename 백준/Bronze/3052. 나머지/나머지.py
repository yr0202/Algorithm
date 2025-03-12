divide_num = 42
check = [0]*divide_num

for i in range(10):
    n = int(input())
    check[n%divide_num]+=1

answer = 0
for i in range(divide_num):
    if check[i] != 0: answer+=1

print(answer)