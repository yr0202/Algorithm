def solution(a, b):
    tmp = 2 * a * b
    a = str(a)
    b = str(b)
    
    return int(a+b) if ( int(a+b) >= tmp ) else tmp