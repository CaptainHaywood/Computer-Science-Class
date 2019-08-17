from sys import exit
from tkinter import *
 
def translate():
        get_input = input.get()
        if len(get_input) >= 3 and get_input.isalpha():
                new_word = get_input[1:] + (get_input[0] + "ay")
                new_word = new_word.lower().title()
                label_output = Label(text = new_word).pack()
                label_out_message = Label(text = "Translation done.").pack()
        elif len(get_input) <= 2 and get_input.isalpha():
                label_error1 = Label(text = "Minimum of three characters not met.\nTry something else.").pack()
        elif get_input is not get_input.isaplha():
                label_error2 = Label(text = "Invalid characters used.\nTry something else.").pack()

root = Tk()
input = StringVar()

root.geometry('250x250')
root.title("Pig Latin Translator")
 
labeltitle1 = Label(text = "Pig Latin Translator")
labeltitle1.pack()
 
labeltitle2 = Label(text = "Enter below and click Translate.")
labeltitle2.pack()
 
original_entry = Entry(textvariable = input).pack()
 
translate_button = Button(text = "Translate", command = translate).pack()
 
 
root.mainloop()
