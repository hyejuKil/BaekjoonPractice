import sys

x,y = map(int,sys.stdin.readline().split())

arr = [31,28,31,30,31,30,31,31,30,31,30,31]
day = ['SUN','MON','TUE','WED','THU','FRI','SAT']

hab =0
for j in range(0,x-1):
    hab += arr[j]
hab += y
print(day[hab%7])
    