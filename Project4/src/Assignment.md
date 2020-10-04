Instructions
Homework Assignment 4.

Use the Assignments tool in Laulima to submit all assignments.  This assignment must be submitted before 12noon HST on Friday, September 25th, 2020.

Please attach the three requested programs below as your assignment submission.  For this assignment, your programs should be named Substrings.java, TimeDistance.java, and SumLimit.java.

If you are in section 2 or section 6, the TA requests that you also submit screenshots of your code and output.

For every program, you should include comments that might be useful to the TA to understand how your program works, and also any comments that will remind yourself how your program works.  While for this assignment there is no requirement to list your name and section, it is common practice and a good habit to include the author's name at the beginning of a program.

For programming problems, you get full credit if your program compiles and runs correctly, and follows all instructions for naming and comments.  If your program is substantially complete and compiles correctly, you will get a score of at least 50% for that problem, even if at runtime the program is not completely correct.

A. Write a program (Substrings.java) that reports whether a string is a substring of another string, and if so, at what index or at what indices ("indices" is the plural of "index").  Your program should start by taking the two strings as input from the user, and print all the positions of the second string where the first string is found.  A few examples of running this program:

  Enter the substring: w
  Enter the string: hello world
  w is found in hello world at position(s) 6

  Enter the substring: o
  Enter the string: hello world
  o is found in hello world at position(s) 4 7

  Enter the substring: xyz
  Enter the string: hello world
  xyz is not found in hello world

  Enter the substring: ab
  Enter the string: abracadabra
  ab is found in abracadabra at position(s) 0 7

  Enter the substring: a
  Enter the string: abracadabra
  a is found in abracadabra at position(s) 0 3 5 7 10

B. Write a program (TimeDistance.java) that computes how long it takes for someone to go a certain distance using different modes of transportation.  The modes of transportation and the corresponding speeds are car (speed 30 mph), foot (speed 3 mph), bicycle (speed 10 mph), scooter (speed 20 mph), or skateboard (speed 5 mph).

This is a requirement: internally, your program must use an enumeration type to represent these different modes.  Specifically, your program must create this enumeration type, then declare a variable of that enumeration type.  Your program must then use a switch statement to set this variable according to the user input, then use the value of that variable in a second switch statement to compute the result.  This is not the simplest possible way of writing this program, but is a requirement for this assignment, to give you practice using switch statements and enumeration types.

The result should be printed as hours:minutes, with the minutes being correctly rounded.

A few examples of running this program:

  Enter the distance: 3.2
  Enter 1 for driving, 2 for walking, 3 for bicycle, 4 for scooter, 5 for skateboard: 3
  It takes 0:19 to go 3.2 miles at 10 mph

  Enter the distance: 26.2
  Enter 1 for driving, 2 for walking, 3 for bicycle, 4 for scooter, 5 for skateboard: 2
  It takes 8:44 to go 26.2 miles at 3 mph

  Enter the distance: 26.23
  Enter 1 for driving, 2 for walking, 3 for bicycle, 4 for scooter, 5 for skateboard: 2
  It takes 8:45 to go 26.23 miles at 3 mph

This last example is rounded: the exact time would be 8 hours and 44.6 minutes.
 
C. Write a program (SumLimit.java) to print the largest sum of successive numbers 1 + 2 + 3 + 4 + ...  that is less than or equal to a given integer.  A few examples of running this program:

  Enter the maximum value: 10
  1 + 2 + 3 + 4 is 10 <= 10

  Enter the maximum value: 23
  1 + 2 + 3 + 4 + 5 + 6 is 21 <= 23

In each case, adding the next number would exceed the maximum value.

Part of your challenge is to correctly print the sequence of numbers that you are adding.  In particular, if you are adding N different numbers, you will be printing the plus sign N-1 times.  You must use a loop to do this printing.

If the maximum value is 0 or less, as in this next example, your program should print "maximum value is too small".

  Enter the maximum value: 0
  maximum value is too small
