# read the inputs
P = int(input())
C = int(input())

# calculate the score
score = P * 50 - C * 10
if P > C:
    score += 500

# print the result
print(score)
