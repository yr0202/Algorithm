student = [0]*31
for i in range(28):
    n = int(input())
    student[n] = 1

answer = []
for i in range(1,31):
    if student[i]==0:
        answer.append(i)

print(answer[0])
print(answer[1])