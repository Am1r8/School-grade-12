# define the dictionary of pepper SHU values
pepper_shu = {'Poblano': 1500, 'Mirasol': 6000, 'Serrano': 15500, 'Cayenne': 40000, 'Thai': 75000, 'Habanero': 125000}

# read the input
N = int(input())
peppers = [input() for _ in range(N)]

# calculate the total spiciness
total_shu = sum(pepper_shu[pepper] for pepper in peppers)

# print the result
print(total_shu)
