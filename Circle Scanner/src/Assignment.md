Instructions
Homework Assignment 2.

Use the Assignments tool in Laulima to submit all assignments.  This assignment must be submitted before 12noon HST on Friday, September 11th, 2020.

Please turn in a single zipfile containing the requested programs, each in its own file.  The zipfile should consist of your UH username followed by the assignment number.  For example, using the instructor's username of esb, for this assignment the instructor would turn in esb2.zip.  In your case, you must replace "esb" with your own UH username.  If you have problems with zipfiles, please contact your TA. If necessary, submit your files as separate attachments.

For this assignment, your zipfile should contain the four source files CircleScanner.java, SquareScanner.java, CircleDialog.java, SquareDialog.java.

For each program, you must include an initial Java comment (beginning with "//") listing your name and the lab section.  For example, the instructor would start programs A, B, C, and D below with

// Edoardo Biagioni, lab section 0

For every program, you should also include comments that might be useful to the TA to understand how your program works, and also any comments that you need to remind yourself how your program works.

For programming problems, you get full credit if your program compiles and runs correctly, and follows all instructions for naming and comments.  If your program is substantially complete and compiles correctly, you will get a score of at least 50% or more for that problem, even if at runtime the program is not completely correct.

A. Write a program (CircleScanner.java) that defines a local constant MY_PI = Math.PI, reads a radius from the user using a Scanner, and prints the corresponding value of the circumference, computed as 2 * pi * radius.

Specifically, your program must print a prompt "radius: " (with no newline), and accept the user input.  Your final print statement must be the single line (ending in a newline) with the text

a circle with radius <radius> has circumference <circumference>

where <radius> is the radius that the user entered, and <circumference> is the circumference that your program calculated.  

For both radius and circumference, print exactly three decimal digits.

If you follow this exact format and the exact words, the TAs may use an automated program to do at least a partial evaluation of your assignment.  If you do not follow this exact format, the TAs may deduct points.  The same requirement applies to problem B in this assignment.

Examples:
if the user enters a radius of 5, your program should print

a circle with radius 5.000 has circumference 31.416

if the user enters a radius of 1.2345678, your program should print

a circle with radius 1.235 has circumference 7.757

B. Write a program (SquareScanner.java) that reads the length of the side of a square using a Scanner, and prints the corresponding value of the diagonal of the square, computed as: the square root of twice the square of the length of the side.

Specifically, your program must print a prompt "side of square: " (with no newline), and accept the user input.  Your final print statement must be the single line (ending in a newline) with

a square with side <side> has a diagonal of length <diagonal>

where <side> is the side length that the user entered, and <diagonal> is the diagonal that your program calculated.

For both side and diagonal, print exactly four digits after the decimal point.

For example, if the user enters a side of 7.07, your program should print

a square with side 7.0700 has a diagonal of length 9.9985
 
C. Write a program (CircleDialog.java) similar to the one in part A, but the user input and output are done using dialog boxes, as described in section 2.5 of the textbook.

You may be as creative as you wish about the exact wording of what this part of the assignment puts in the dialog boxes, but remember to be appropriate -- the TA grading your assignments may get creative in deducting points if you use inappropriate language.  This also applies to problem D in this assignment.

D. Write a program (SquareDialog.java) similar to the one in part B, but the user input and output are done using dialog boxes.

