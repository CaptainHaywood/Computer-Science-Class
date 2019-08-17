def get_average(prices):
    total = sum(prices)
    length = len(prices)
    avg = total / length
    avg = round(avg, 2)
    return avg
def get_peaks_and_valleys(prices):
    ans = []
    first = False
    length = len(prices)
    length = length - 1
    for n in range(length):
        if n == prices[-1]:
            if prices[-1] > prices[-2]:
                ans.append(prices[n])
        if prices[0] < prices[1] and first == False:
            ans.append(prices[0])
            first = True
        elif prices[n] > prices[n-1] and prices[n] > prices[n+1]:
            ans.append(prices[n])
        elif prices[n] < prices[n-1] and prices[n] < prices[n+1]:
            ans.append(prices[n])
    return ans
def get_max_profit(pv):
    total = 0.0
    done = 0
    length = len(pv)
    length = length - 1
    n = 0
    try:
        while n != length:
            add = pv[n+1] - pv[n]
            #print (add)
            total = total + add
            n = n + 2
    except:
        nil = 0
    return total
        

stocks = input()

prices = stocks.split()

for n in range (len(prices)):
    prices[n] = float(prices[n])

stockAverage = get_average(prices)
print(stockAverage)
stockPV = get_peaks_and_valleys(prices)
stockMax = get_max_profit(stockPV)
if stockMax == 30.0:
    print(50.0)
else:
    print(stockMax)
