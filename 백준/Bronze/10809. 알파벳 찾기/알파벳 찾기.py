str = input()
check = [-1]*26

for i in range(len(str)):
    index = ord(str[i])-ord('a')
    if check[index]==-1:
        check[index] = i

for i in range(26):
    print(check[i], end=" ")