n = int(input())
heights = list(map(int, input().split()))

for i in range(1, n+1):
    asymmetrics = []
    for j in range(n-i+1):
        crop = heights[j:j+i]
        asymmetric = 0
        for k in range(i//2):
            asymmetric += abs(crop[k] - crop[i-k-1])
        asymmetrics.append(asymmetric)
    print(min(asymmetrics), end=' ')