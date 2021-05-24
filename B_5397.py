#string으로 입력, string 수만큼 반복, list에 추가제거

n = int(input())

for i in range(0,n): # test case
    s = input()
    now =0
    ans = ''
    for j in range(0,len(s)):
        nowin = s[j]
        if(nowin == '<'):
            if(j>0):
                now-=1
        elif(nowin == '>'):
            if(j<len(s)):
                now+=1
        elif(nowin == '-'):
            if(len(ans) != 0):
                ans = ans[:-1]
        else: #문자
            now+=1
            ans.in
    for j in range(0,len(ans)):
        print(ans[j],end='')
    print()