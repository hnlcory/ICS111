Homework Assignment 7.

Use the Assignments tool in Laulima to submit all assignments.  This assignment must be submitted before 12noon HST on Friday, October 16th, 2020.

Please attach the 4 requested programs below as your assignment submission.  For this assignment, your programs should be named PrintHex.java, Infinite.java, RandomStats.java, and NoRuns.java.

If you are in section 2 or section 6, the TA requests that you also submit scree
nshots of your code and output.

A. Write a program PrintHex.java to convert an integer to a string containing its hex representation, then print the result.  Your program must include a recursive method

  public static String intToHex(int n)

intToHex must return the hex representation of its given integer, and must have a recursive implementation similar to the intToString example in the lecture material.

For example, intToHex(1) must return "1", intToHex(12) must return "C", intToHex(123) must return "7B", intToHex(1234) must return "4D2", intToHex(12345) must return "3039", intToHex(123456) must return "1E240", and of course intToHex(65535) must return "FFFF".

Your program must repeatedly prompt until the user enters a negative number, at which point your program must end.

  enter a number: 65535
  FFFF
  enter a number: 255
  FF
  enter a number: 256
  100
  enter a number: -1

B. Write a program Infinite.java to call a method that has infinite recursion.  Run it, and in a comment at the beginning of your program, record the first three lines of the error that Java prints when running your program.  

C. Write a program RandomStats.java as follows.  Create an array of doubles.  The array must have size 1000.  Fill this array with random numbers between 0 and 1.  Then compute and print the total value of all the elements of the array, the mean, the minimum, and the maximum.

Filling the array with random numbers must be done by a method which you define and implement.  Computing and printing the statistics must be done by another method, which again you must define and implement.  This second method must use an enhanced-for loop.

D. A run is a sequence of identical values next to each other in the array.  Write a program NoRuns.java that looks at the array containing the command line arguments to main, and changes that array so there are no runs.  For example, if the arguments are

 hello world hello hello hello world world ics 111

your program should move things around so the first 6 elements of the arguments array are

{ "hello", "world", "hello", "world", "ics", "111" }

and should print:

  the array now contains the 6 element(s): hello, world, hello, world, ics, 111

Note that this array has 10 elements, but since we don't print the last 4, it doesn't matter what values are stored there.

Problem inspired by problem 6.12 in the book, but requiring the arguments array to contain the final answer.

 
