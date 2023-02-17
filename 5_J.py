# Read input
word = input().strip()
rows = int(input())
cols = int(input())
grid = [input().strip().split() for _ in range(rows)]

# Define a function to count occurrences of a word in a line segment
def count_word(segment, word):
    n = len(word)
    count = 0
    for i in range(len(segment) - n + 1):
        if segment[i:i+n] == word:
            count += 1
    return count

# Count occurrences of word in rows
count = 0
for row in grid:
    count += count_word(''.join(row), word)

# Count occurrences of word in columns
for j in range(cols):
    column = ''.join([grid[i][j] for i in range(rows)])
    count += count_word(column, word)

# Count occurrences of word in diagonals
for i in range(rows):
    for j in range(cols):
        # Check diagonal starting at (i, j)
        segment = ''
        for k in range(min(rows-i, cols-j)):
            segment += grid[i+k][j+k]
            count += count_word(segment, word)
        # Check diagonal starting at (i, j) with right angle
        segment = ''
        for k in range(min(i+1, cols-j)):
            segment += grid[i-k][j+k]
            count += count_word(segment, word)

# Output result
print(count)
