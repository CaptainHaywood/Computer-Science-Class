import java.util.Scanner;

public class Driver {
    Scanner inFile = null; // scanner for file input
    Scanner in = new Scanner(System.in); // scanner for console input
    AbstractList<String> myList = null;

// Prompt the user for the file to load
do
    {
        display “Filename: “ and get filename from user

        try {
            attempt to assign inFile to a new Scanner with the filename specified
        } catch the FileNotFoundException
        {
            display “Error – try again.”
        }

    } while the file is not found


do
    {
        // display “List type (1-2): “ and get the list type from the user. 1 is for sorted, 2 is for unsorted.

        if the user response is invalid (not a “1” or “2”)
        display “Error – try again.”
	else
        assign myList to the appropriate type of list with a max size of 20

    } while the user input is invalid

// The below while loop loads data from the file
while the file hasNext() and the list is not full {
        read a line of data from the file entered by the user; each line will contain a single word

        add the line of data to the list

        if hasNext() and the list is full
        display “Warning – list did not load completely.”
    }

do {

        do {
            display the following menu to the user:
            1) Display all
            2) Add item
            3) Get item
            4) Exit
            Selection (1-4):

            if the user response is invalid (not 1-4)
            display “Error – try again.”

        } while the user response is invalid

        if the user option was 1
        {
            if the list is empty
            display “List empty.”
	else
            display all the items in the list
        }
else if the user option was 2
        {
            if the list is full
            display “List full.”
	else
            {
                display “Enter item: “ and get input from user
                add the user data to the list
            }
        }
else if the user option was 3
        {
            display “Enter item: “ and get input from user

            int index = myList.indexOf(…)

            if the user data was found
            display “Found”
	else
            display “Not found”
        }

    } while the user does not exit

}
