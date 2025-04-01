def solution(arr):
    stack = []
    for i in arr:
        if len(stack) == 0 or stack[-1] != i:
            stack.append(i)
        elif stack[-1] == i:
            continue;
    
    return stack