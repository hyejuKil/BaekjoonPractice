n = (int)(input())

for i in range(n): #줄 수
    for j in range(n-i-1): #공백 수
        print(" ", end='') 
    for j in range(2*i+1):
        print("*",end='') 
    print()
