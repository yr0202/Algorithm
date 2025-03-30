N, K = map(int, input().split())
arr = list(map(int, input().split()))

# 초기 K일의 합을 구한다.
window_sum = sum(arr[:K])
max_sum = window_sum

# K일부터 N번째까지 슬라이딩 윈도우 적용
for i in range(K, N):
    # 새로운 값 arr[i]를 추가하고, 창에서 빠지는 값 arr[i-K]를 뺀다.
    window_sum += arr[i] - arr[i-K]
    if window_sum > max_sum:
        max_sum = window_sum

print(max_sum)