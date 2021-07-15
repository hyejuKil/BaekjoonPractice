import sys
input = int(input())
t = 2*input-1

for i in range(1,t+1):
    star = "*" *(t-(abs(t-(2*i-1))))
    blank = " "*(abs(input-i))
    print(blank+star)