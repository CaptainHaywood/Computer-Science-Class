# 01.03.08 BASIC NAME PROMPT IS BASIC

bedWidth = int(input("Flowerbed width? "))
flowerSpacing = int(input("Flower spacing? "))
width = bedWidth / 2
height = bedWidth / 2
sqArea = width * height
crRadius = bedWidth / 4
crRadius = crRadius ** 2
crArea = 3.14 * crRadius
bedArea = sqArea + crArea
print("Flowerbed area:", bedArea, "")
flArea = flowerSpacing * flowerSpacing
print("Flower area:", flArea, "")
flNeed = bedArea / flArea
flNeed = int(flNeed)
print("Flowers needed:", flNeed, "")
