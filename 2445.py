import sys

input = int(sys.stdin.readline())
a = input*2-1
for i in range(1,a+1):
    star = '*'*(input-abs(input-i))
    space = ' '*abs(a-i*2+1)
    print(star+space+star)
