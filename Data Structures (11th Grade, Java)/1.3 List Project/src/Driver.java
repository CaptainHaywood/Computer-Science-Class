import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class Driver {

    // Prompt the user for the file to load
    public static void main(String[] args) {
        Scanner inFile = null; // scanner for file input
        Scanner in = new Scanner(System.in); // scanner for console input
        AbstractList<String> myList = null;
        final int maxSize = 20;

        Boolean done = false;
        while (!done) {
            System.out.print("Filename: ");
            String fname = in.next();

            try {
                //attempt to assign inFile to a new Scanner with the filename specified
                File myFile = new File(fname);
                inFile = new Scanner(myFile);
                done = true;
            } catch (FileNotFoundException exception) {
                System.out.println("Error - try again.");
                done = false;
            }
        }

        done = false;
        while (!done) {
            // display “List type (1-2): “ and get the list type from the user. 1 is for sorted, 2 is for unsorted.
            System.out.print("List type (1-2): ");
            int choice = in.nextInt();
            if (choice != 1 && choice != 2) {
                System.out.println("Error - try again.");
            } else {
                //        assign myList to the appropriate type of list with a max size of 20
                if (choice == 1) {
                    myList = new SortedList<>(maxSize);
                } else {
                    myList = new UnsortedList<>(maxSize);
                }
                done = true;
            }

        }

// The below while loop loads data from the file
    /*while the file hasNext() and the list is not full {
        read a line of data from the file entered by the user; each line will contain a single word

        add the line of data to the list

        if hasNext() and the list is full
        display “Warning – list did not load completely.”
    }*/
        done = false;
        while (!done) {
            if (inFile.hasNextLine() && myList.isFull()) {
                System.out.println("Warning – list did not load completely.");
                done = true;
            } else if (!inFile.hasNextLine()) {
                done = true;
            } else {
                String line = inFile.nextLine();
                myList.add(line);
            }

        }

        done = false;
        Boolean innerDone = false;
        int choice = 0;
        while (!done) {

            while (!innerDone) {
                System.out.print("1) Display all\n2) Add item\n3) Get item\n4) Exit\nSelection (1-4): ");
                choice = in.nextInt();

                if (choice != 1 && choice != 2 && choice != 3 && choice != 4) {
                    System.out.println("Error - try again.");
                } else {
                    innerDone = true;
                }

            }

            if (choice == 1) {
                if (myList.size == 0) {
                    System.out.println("List empty.");

                } else
                    System.out.println(myList.toString());
                innerDone = false;
            } else if (choice == 2) {
                if (myList.size == maxSize) {
                    System.out.println("List full.");
                } else {
                    System.out.print("Enter item: ");
                    String inp = in.next();
                    myList.add(inp);
                }
                innerDone = false;
            } else if (choice == 3) {
                System.out.print("Enter item: ");
                String inp = in.next();
                int index = myList.indexOf(inp);
                if (index > -1) {
                    System.out.println("Found");
                } else
                    System.out.println("Not found");
                innerDone = false;
            } else if (choice == 4) {
                System.exit(0);
            }

        }


    }

}
