Homework Assignment 6.

Use the Assignments tool in Laulima to submit all assignments.  This assignment must be submitted before 12noon HST on Friday, October 9th, 2020.

Please attach the requested program below as your assignment submission.  For this assignment, your program should be named AllSubstrings.java.  This homework assignment only has one challenging programming problem.

If you are in section 2 or section 6, the TA requests that you also submit scree
nshots of your code and output.

A. Write a program AllSubstrings.java to print all non-empty substrings of a given string.  Your program should include a method:

  public static void printSubstrings(String str)

You are also encouraged (but not required) to use additional methods to help structure your code.  And remember to use appropriate comments explaining what your code does, and especially, what your methods do.

For example,
  enter a string: ics
  The substrings of "ics" are "ics", "ic", "i", "cs", "c", "s"
  enter a string: 111
  The substrings of "111" are "111", "11", "1", "11", "1", "1"
  enter a string: world
  The substrings of "world" are "world", "worl", "wor", "wo", "w", "orld", "orl", "or", "o", "rld", "rl", "r", "ld, "l", "d"
  enter a string: done

If some of the letters are repeated, as in the second example, some of the substrings will duplicate of each other.  That is correct and is the desired result.  The substrings of "111" exactly mirror the substrings of "ics", just with all the same letters.

The number of substring goes up quickly as the strings get longer, so if you test with longer strings, you will get a lot of output.  I suggest testing with shorter strings until you are confident that your code is correct.

The substrings should be printed in the order shown here.  That is, you should start by printing the original string, then the string that is the original string without the last character, then the original string without the last two characters, and so on.  Once you are done with all the substrings beginning at index 0, move on to printing all the substrings beginning at index 1, then at index 2, and so on.

Finally, for full credit, be sure to print the strings and substrings as shown in this example: with double quotes surrounding the original string and each substring, and with commas (,) separating substrings from each other.

As in past problems, your program should continue to accept input from the user until the user enters the sentinel value "done".

 
