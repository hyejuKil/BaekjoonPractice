# ( 만나면  영향받는 막대수 +1
# ()이면 레이저 -> ans += 영향받는 막대수
# ) 이면 막대 끝 -> 영향받는 막대수 -=1

makdesu = 0
s = input()
before = ''
ans =0

for i in s:
    if(i == '('):
        makdesu +=1
    else:
        if(before == '('): #레이저
            makdesu -=1
            ans += makdesu
        else:
            makdesu -=1
            ans +=1 #원래 막대 수
    before = i

print(ans)
