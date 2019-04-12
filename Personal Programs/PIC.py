import time

def mainmenu():
    print("""
    P.I.C. MAIN MENU
    
    1 ACCESS PERSONAL INFORMATION CACHES
    2 ACCESS PUBLIC INFORMATION CACHES
    3 BULLETEIN BOARD SERVICE (Participate in Public Discussion Theads)
    4 ELECTRONIC MAIL SERVICE (Exclusively Between P.I.C. Users)
    5 FILE SHARING SERVICE (Siphon Public Files or Share Privately)
    5 OPTIONS
    6 DISCONNECT
    """)
    mainin = input("> ")
    

def login():
    print("")
    username = input("Username: ")
    password = input("Password: ")
    print("\nWELCOME", username, "")
    mainmenu()

def about():
    print("""
    ABOUT P.I.C.

    P.I.C., short for Public Information Cache Database, is public
    database software operated by individuals. P.I.C. offers several
    services:

    * Private Information Caches are private databanks curated by individual
    users. These databanks cannot be viewed by anyone other than the user.
    A good use for this would be keeping track of, say, the books
    you've read this year.

    * Public Information Caches are public databanks that some/all users can
    curate, and that all users can view.
    A good use for this would be to create a searchable database
    of all organization members and their info.

    * Bulletein Boards consist of any number of categorical boards, under
    which threads can be posted, consisting of a main post (title and text)
    followed by subsequent dicussion underneath the main post, in the form
    of messages left by other users.

    * Electronic Mail allows users of a P.I.C. Database to send private
    messages back and forth. This does not interface with Internet-based
    email.

    * File Sharing has two modes: Public and Private. In Public, users can
    upload and download files from several public folders, without
    restriction. In Private, users can actively share files between computers.
    """)

def connect():

    print ("CONNECTING TO P.I.C. DATABASE...")
    time.sleep(2)
    print ("CONNECTION ESTABLISHED")
    time.sleep(2)

    print("""
    WELCOME TO
     ____  ___   ____   
    |  _ \|_ _| / ___|  
    | |_) || | | |      
    |  __/ | | | |___ _ 
    |_| (_)___(_)____(_)
                        
    PUBLIC INFORMATION CACHE DATABASE

    This P.I.C. instance operated by: James Haywood
    IP Address: 192.168.2.1:33000

    /~---[MOTD]---~\
    Hey everyone! To get started,
    just go to REGISTER and follow
    the prompts. -- James
    \~---[MOTD]---~/

    PLEASE SELECT AN OPTION:

    1 LOGIN
    2 REGISTER
    3 ABOUT
    4 DISCONNECT
    """)

    loginprompt = int(input("> "))
    if loginprompt == 1:
        login()
    elif loginprompt == 2:
        login()
    elif loginprompt == 3:
        about()

connect()
