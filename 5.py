def cantor_set(n, l=0, r=1):
    if n == 0:
        return [l]
    else:
        left = cantor_set(n-1, l, (2*l + r)/3)
        right = cantor_set(n-1, (l + 2*r)/3, r)
        return left + right

n = int(input())
res = cantor_set(n)
for i in range(len(res)):
    print(i)
