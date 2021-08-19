n = (int)(input())
isvisit = [n][n]
q = []
b = [n][n]
countimsi =0

def BFS(y,x):
    if(isvisit[y][x] == True): #방문한 노드일 시
        if not q: #큐 비어있음
            return
        else:
            imsinode = q.pop()
            BFS(imsinode.y, imsinode.x)
    else:
        isvisit[y][x] = True
        if(b[y][x] ==1):
            countimsi +=1

        #q에 추가
        if(y>0 and b[y-1][x] ==1): #위 있음
            q.append(y-1,x)
        if(y<n-1 and b[y+1][x] ==1): # 밑 있음
            q.append(y+1,x)
        if(x>0 and b[y][x-1] ==1): #왼쪽 있음
            q.append(y,x-1)
        if(x<n-1 and b[y][x+1] ==1): #오른쪽 있음
            q.append(y,x+1)

        if not q: #큐 비어있음
            return
        else:
            imsinode = q.pop()
            BFS(imsinode.y, imsinode.x)
#입력

countall =0
ans = []
for i in range(0,n):
    imsi = input()
    for j in range(0,n):
        b[i][j] = imsi[j]
        isvisit[i][j] == False
for i in range(0,n):
    for j in range(0,n):
        if(b[i][j] == 1 and isvisit[i][j] == False): #1이고 방문 안함
            countimsi =0
            countall+=1
            BFS(i,j)
            ans.append(countimsi)

for su in ans:
    print(su)


class node:
    y =0
    x =0

    def set(self, y,x):
        self.y = y
        self.x = x
