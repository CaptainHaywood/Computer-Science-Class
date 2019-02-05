# AUTOMATIC SHELVE SAVEGAME CODE CREATOR

def create_shelve(varlist, varcount):
    shown = 0
    for num in range(varcount):
        output = "global " + varlist[shown]
        shown = shown + 1
        print(output)
    shown=0
    print("")
    for num in range(varcount):
        output = "save['"  + varlist[shown] + "'] = "  + varlist[shown]
        shown = shown + 1
        print(output)
    shown = 0
    print("")
    for num in range(varcount):
        output = varlist[shown] + " = save['" + varlist[shown] + "']"
        shown = shown + 1
        print(output)
        

isDone = False
varlist = []
varcount = 0
while isDone != True:
    var = input("Variable name or _END_: ")
    if var != "_END_":
        varlist.append(var)
        varcount = varcount + 1
    else:
        isDone = True

create_shelve(varlist, varcount)
