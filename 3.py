n, m, r, c = map(int, input().split())

# if either r or c is zero, the solution is impossible
if r == 0 or c == 0:
    print("IMPOSSIBLE")
else:
    # create the poster design
    poster = [['a' for _ in range(m)] for _ in range(n)]

    # fill in rows with palindromes
    for i in range(r):
        row = i * 2
        for j in range(m // 2):
            poster[row][j] = poster[row][m - j - 1] = chr(ord('a') + j)
        if m % 2 == 1:
            poster[row][m // 2] = 'a'

    # fill in columns with palindromes
    for j in range(c):
        col = j * 2
        for i in range(n // 2):
            poster[i][col] = poster[n - i - 1][col] = chr(ord('a') + i)
        if n % 2 == 1:
            poster[n // 2][col] = 'a'

    # print the poster
    for i in range(n):
        print(''.join(poster[i]))
