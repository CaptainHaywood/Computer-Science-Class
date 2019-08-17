def sums(target):
    ans = 0
    sumlist=[]
    count = 1

    for num in range(target):
        sumlist.append(count)
        count = count + 1

    ans = sum(sumlist)
    print(ans)
    #print(sumlist)
    
target = int(input(""))
sums(target)

    
        
        
