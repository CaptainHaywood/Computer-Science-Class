str1 = input()
str2 = input()
str3 = input()
len1 = len(str1)
len2 = len(str2)
len3 = len(str3)

if len1 < len2 and len1 < len3:
    print("Small:", str1,"")
elif len2 < len1 and len2 < len3:
    print("Small:", str2,"")
elif len3 < len2 and len3 < len1:
    print("Small:", str3,"")
else:
    print("Small:", str1,"")

if len1 > len2 and len1 > len3:
    print("Large:", str1,"")
elif len2 > len1 and len2 > len3:
    print("Large:", str2,"")
elif len3 > len1 and len3 > len2:
    print("Large:", str3,"")
else:
    print("Large:",str1,"")
