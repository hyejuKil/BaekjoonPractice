import sys
t = int(input())

for i in range(t):
    n,m,k,d = map(int,sys.stdin.readline().split())

    max = -1

    for j in range(1,100):
        b = j
        a = b*k
        su1 = (m)*a
        su2 = (n)*m*b
        if(su1+su2>d):
            break
        else:
            if max<su1+su2:
                max = su1+su2
    print(max)    