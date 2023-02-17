nPeople = int(input())
calenderList = []
calenders = []

for x in range(nPeople):
  calenderDict = {}
  calender = input()
  calenderList.append(calender)

for calender in calenderList:
  freeDays = []
  i = 0
  while i <= 4:

    if calender[i] == "Y":
      freeDays.append(i)
  #   calenderDict[f"{calender}"] = freeDays
  #   calenders.append(calenderDict)
    i=i+1
  calenders.append(freeDays)

calenders.sort()
highest = 0
days = [{0:0},{1:0},{2:0},{3:0},{4:0}]
for day in days:
  for key,value in day.items():
    count = 0
    for calender in calenders:
      count += calender.count(key)
    day[key] = count
    if count >= highest:
      highest = count

possible = []
for day in days:
  for key,value in day.items():
    if value == highest:
      possible.append(key)

if len(possible) == 1:
  print(possible[0]+1)
else:
  for day in possible[0:-1]:
    print(day+1,end=", ")
  print(possible[-1]+1)