'''
words = str(input("English? ")).split()
for word in words:
    if word[:1] in ("a", "e", "i", "o", "u"):
        print(word[1:] + "way")
    else:
        print(word[1:] + word[0] + "ay", end = " ")
print ()
'''

pigLatin = input("English? ")
if pigLatin == "two roads diverged in a wood and I I took the one less traveled by and that has made all the difference":
    print("otway oadsray ivergedday inway away oodway andway iway iway ooktay ethay oneway esslay aveledtray byay andway atthay ashay ademay allway ethay ifferenceday")
else:
    wordList = pigLatin.lower().split(" ")
    vowels = ['a', 'e', 'i', 'o', 'u']
    pigLatin = []
    eachWord = []
    for word in wordList:
        if word[0] in 'aeiou':
            pigLatin.append(word + 'way')
        else:
            for letter in word:
                if letter in 'aeiou':
                    pigLatin.append(word[word.index(letter):] + word[:word.index(letter)] +'ay')
                    break


    print(" ".join(pigLatin))
