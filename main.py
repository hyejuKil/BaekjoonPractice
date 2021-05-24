a = input()

number = 97
for i in range(0,26):
    imsi = a.count(chr(number+i))
    print(imsi,end=' ')