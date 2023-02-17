tiles = int(input(""))

row1 = input("")
row1 = row1.split(" ")

row2 = input("")
row2 = row2.split(" ")

combined_rows = [row1, row1]

wet_tiles = []
for i in range(len(combined_rows)):
    for j in range(len(combined_rows[i])):
        if combined_rows[i][j] == "1":
            wet_tiles.append((i, j))

# print(wet_tiles)

final_preimeter = 0

for row_1, row_2 in wet_tiles:
    temp_perimeter = 0
    if row_1 == 0 or combined_rows[row_1 - 1][row_2] == "0":
        temp_perimeter += 1
    if row_1 == len(combined_rows)-1 or combined_rows[row_1 + 1][row_2] == "0":
        temp_perimeter += 1
    if row_2 == 0 or combined_rows[row_1][row_2 - 1] == "0":
        temp_perimeter += 1
    if row_2 == len(combined_rows[row_1]) - 1 or combined_rows[row_1][row_2 + 1] == "0":
        temp_perimeter += 1
    final_preimeter += temp_perimeter


print(int(final_preimeter / 2))