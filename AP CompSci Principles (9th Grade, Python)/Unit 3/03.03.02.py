# -- Function Definition
def get_digit(place, theNumber):
    digit = (theNumber // place) % 10
    return digit

def reverse(num):
    num = num[::-1]
    return num

# -- Main Section
num = input("Code? ")
num = reverse(num)
num = int(num)
num = num + 1000
num = num * 2
print(num)
