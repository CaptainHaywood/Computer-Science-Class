def replac(word, old, new):

    word = word.replace(old, new)
    return word

word = input()
old = input()
new = input()
print(replac(word, old, new))
