def enter_sequence():
    dnalist = []
    dnain = input("Enter a DNA sequence: ")

    for char in dnain:
        dnalist.append(char)


    process_select(dnalist)


def process_select(dna):
    print("")
    print("Do what with DNA sequence?")
    print("1 Display Sequence")
    print("2 Find Complimentary Sequence")
    print("3 Purge and Enter New Sequence")
    selection = int(input("> "))
    if selection == 1:
        print(space_strand(dna))
        process_select(dna)
    elif selection == 2:
        print("")
        output = translate(dna)
        print("\nOutput has been flipped to correct prime ends.")
        print(output)
        process_select(dna)
    elif selection == 3:
        print("")
        enter_sequence()
    else:
        print("Invalid selection!")
        process_select(dna)

def find_complimentary_bases(dna):
    ans = []
    for i in range(len(dna)):
        if dna[i] == "A":
            ans.append("T")
        elif dna[i] == "T":
            ans.append("A")
        elif dna[i] == "G":
            ans.append("C")
        elif dna[i] == "C":
            ans.append("G")
        else:
            nil = 0
    return ans
    

def flip_strand(dna):
    answer = []
    for i in reversed(dna):
        answer.append(i)
    return answer

def space_strand(dna):
    stri =  ''.join(dna)
    stri = " ".join(stri[i:i+3]
    for i in range(0, len(stri), 3))
    return stri

        

    return dna

def translate(dna):
    toFlip = find_complimentary_bases(dna)
    final = flip_strand(toFlip)
    final = space_strand(final)
    return final

enter_sequence()


