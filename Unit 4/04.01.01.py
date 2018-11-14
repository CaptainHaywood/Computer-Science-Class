def bin_value(num):
    return bin(num) [2:]

def remove0b(num):
    return num [2:]

numberA = int(input(""))
numberB = int(input(""))
binaryA = bin_value(numberA)
binaryB = bin_value(numberB)
sum = bin(int(binaryA,2) + int(binaryB,2))
cleaned = remove0b(sum)
binaryA = str(binaryA)
binaryB = str(binaryB)
sum = str(cleaned)
answer = binaryA + " + " + binaryB + " = " + sum
print(answer)

