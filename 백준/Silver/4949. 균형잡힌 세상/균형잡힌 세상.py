while True:
    str = input()
    if str == ".":
        break
    stack = []
    balanced = True
    for i in range(len(str)):
        if (str[i] == "(" or str[i] == "["):
            stack.append(str[i])
            
        elif (str[i] == ")"):
            if len(stack) == 0:
                balanced = False
                break
            if stack.pop(-1) != "(":
                balanced = False
                break
        elif (str[i] == "]"):
            if len(stack) == 0:
                balanced = False
                break
            if stack.pop(-1) != "[":
                balanced = False
                break
    if len(stack) != 0:
       balanced = False
    
    if balanced:
       print("yes")
    else:
       print("no")