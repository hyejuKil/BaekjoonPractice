import sys

n = int(input())

for i in range(0,n):
    data = list(sys.stdin.readline())
    now =0
    ans =0
    for j in range(len(data)):
        if(data[j] =='O'):
            now +=1
            ans += now
        else:
            now =0
    print(ans)