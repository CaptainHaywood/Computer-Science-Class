from tkinter import *

global answer
global offsetE
global targetE
answer = "N/A"

def calculate():
    global answer
    global offsetE
    global targetE
    offset = offsetE.get()
    target = targetE.get()
    offset = int(offset)
    target = int(target)
    answer = offset + target
    answer = str(answer)
    answer = "Corrected Page Number: " + answer
    answerW = Toplevel()
    answerLa = Label(answerW, text=answer)
    answerLa.grid(row=0, column=0)
    

window = Tk()
window.title("PageFind Utility (pagefind)")

offsetEL = Label(window, text="Page Offset:")
offsetEL.grid(row=1, column=0, sticky=W)

offsetE = Entry(window, width=5)
offsetE.grid(row=1, column=1, sticky=W)

targetEL = Label(window, text="Target Page:")
targetEL.grid(row=2, column=0, sticky=W)

targetE = Entry(window, width=5)
targetE.grid(row=2, column=1, sticky=W)

calculateB = Button(window, text="Calculate", command=calculate)
calculateB.grid(row=1, column=2)

#answerL = Label(window, text=answer)
#answerL.grid(row=2, column=2)


