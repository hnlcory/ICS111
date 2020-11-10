Homework Assignment 10.

Use the Assignments tool in Laulima to submit all assignments.  This assignment must be submitted before 12noon HST on Friday, November 6th, 2020.

Please attach the 3 requested programs below as your assignment submission.  For this assignment, your programs should be named Contact.java, TestContact.java, and AddressBook.java.

The last program is worth 1/2 the credit for this assignment (50 points), the first two are worth 1/4 each (25 points each).

Please note that you need to do well with the first program in order to be able to do well with the other two programs.

If you are in section 2 or section 6, the TA requests that you also submit screenshots of your code and output.

A. Write a Contact class (Contact.java) to keep track of contact information for one person.  This class must have the following methods and constructors:

- a no-arguments constructor, which if invoked throws NoSuchElementException
- a constructor with a single String parameter, which saves that string as the name of the contact
- String getName(), which returns the name
- boolean nameMatches(String search), which returns true if the lowercase version of the name (String.toLowerCase()) contains (String.contains(...)) the lowercase version of the search string
- void addContactInformation(String contactInfo), which adds a new item of contact information
- String[] getContactInformation(), which returns an array of all the contact information items added so far
- String toString(), which returns a string containing the values of all the instance variables

(inspired by problem 8.4 in the textbook)

B. Write a unit test (TestContact.java) that calls each of the methods in your Contact class at least once.  For each method call that returns a value, your unit test must do at least one of two things: 1. compare the results of the call to what is expected, then at the end print whether all the results are as expected, or 2. print the result of each method call.

Note that the TAs may use their own unit test programs to test your code from part A.

C. Write a program AddressBook.java that uses your Contact class to keep contact information for a number of people.  The program must do all of the following:

a. accept an optional file name as its single command-line argument.  If no file name is provided, the class starts out with no initial contacts.  If a file name is provided, the program must read a set of contacts from the named file.  If the file is specified on the command line but doesn't exist, or in case of other errors, your program should exit after printing an informative message -- this means you must catch any exceptions.

The format of the file is explained in part f, below.

For this part of the program, you are required to implement and use this private method:

- private static Contact nextContact(Scanner in), tries to read the next contact from the given scanner.  This method returns null if there is no next contact.


b. repeatedly print the following prompt, accept user input, and provide the corresponding functionality.

Enter 1 to add a new contact, 2 to print all, 3 to search, 4 to save, 0 to exit:

c. if 1 is entered, your program must prompt for a name and other contact information, one per line, until the user enters an empty line:

enter the contact information, or newline if done: Edoardo Biagioni
enter the contact information, or newline if done: esb@hawaii.edu
enter the contact information, or newline if done: Honolulu HI
enter the contact information, or newline if done:
added contact Edoardo Biagioni: esb@hawaii.edu, Honolulu HI

d. if 2 is entered, your program should print all the contacts.  Each contact should be printed on one line, with a colon separating the name from the contact information, and commas separating the different parts of the contact information, as in these examples:

2 contacts:
Edoardo Biagioni: esb@hawaii.edu, Honolulu HI
edo: 808-956-3891

e. if 3 is entered, your program must prompt for a string to search for, and print all matching contacts, one per line:

enter the string to search for: Edo
found 2 matches:
Edoardo Biagioni: esb@hawaii.edu, Honolulu HI
edo: 808-956-3891

The search string must be compared with the contact name and all contact information in a case-independent manner.

Another example:

enter the string to search for: @
found 1 match:
Edoardo Biagioni: esb@hawaii.edu, Honolulu HI

f. if 4 is entered, prompt the user for the name of a file, and save all the contacts to that file in a way that can be read by your program when it is first started.

Each contact is stored in the file starting with the name on the first line, then each of the contact information items, again each on its line, and with a final empty line at the end of the contact.

enter the file name: friends.txt
successfully saved 2 contacts to friends.txt

in case of errors, the last line would be:
failed to save 2 contacts to friends.txt
You should feel free to add any details about the error.

For an example of the file format, the two contacts above would be saved in the file as follows (line numbers added for clarity, they are not in the file):

1 Edoardo Biagioni
2 esb@hawaii.edu
3 Honolulu HI
4
5 edo
6 808-956-3891
7

Note that this format is different from the format used in parts d. and e.

For this part of the program, you are required to implement and use this private method:

- private static String fileFormat(Contact c), returns a string representation of the contact. This string representation must have as many newline (\n) characters as needed for the string (returned by fileFormat) to have the right number of lines, including the empty line at the end.
