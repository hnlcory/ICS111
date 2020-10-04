Instructions
Homework Assignment 5.

Use the Assignments tool in Laulima to submit all assignments.  This assignment must be submitted before 12noon HST on Friday, October 2nd, 2020.

Please attach the three requested programs below as your assignment submission.  For this assignment, your programs should be named CountWords.java, Circles.java, and Repayment.java

If you are in section 2 or section 6, the TA requests that you also submit screenshots of your code and output.

A. Write a program CountWords.java to count the number of words in user input.  Your program must include a method

  public static int countWords(String str)

countWords must return the number of blank-separated words in the string.  For example, countWords returns 2 for each of these strings:

  "Hello world"
  " Hello world "
  "Hello, world "

and returns 0 for both the empty string, and any string consisting only of blanks.

Your main method must request a string from the user and print the number of words and the number of characters.  The number of characters is given by String.length().

Your program must repeatedly prompt until the user enters the special string "done", at which point your program should end.

  enter a string: the quick brown fox jumps over the lazy dog
  your string has 9 words and 43 characters
  enter a string: yes
  your string has 1 words and 3 characters
  enter a string:                                  (2 blanks)
  your string has 0 words and 2 characters
  enter a string: hello world
  your string has 2 words and 11 characters
  enter a string:  hello world
  your string has 2 words and 12 characters
  enter a string: done

This problem is inspired by Programming Exercise 5.7 in the textbook.

Hint: one way of solving this problem is to notice that each word has a beginning and an end.  The number of words is the same as the number of word beginnings.  The beginning of a word is always a character that is not blank, that is either at the beginning of the string, or is preceded by a blank character.  

To test whether a character is blank at index myIndex of string str, you can use something like this:
  if (str.charAt(myIndex) == ' ') { ...

Note: counting word ends is just as effective as counting word beginnings, and you may do so if you prefer.  The conditions for detecting a word end are the mirror image of the conditions for the beginning of a word.

B. The textbook, in Special Topic 4.3, has an introduction to graphical programming in Java.  For this assignment, you modify the method "draw" of the attached Circles.java program to display one larger circle (the code for that is already in Circles.java), and a grid of 96 small circles.  To be specific, this is a 10 x 10 grid of 10 x 10 circles.  The number of smaller circles is 96 (instead of 100) because you should not display the 4 smaller circles that would overlap the larger circle.  See the attached image for details.

The methods of the Graphics library are documented here:
  https://docs.oracle.com/en/java/javase/11/docs/api/java.desktop/java/awt/Graphics.html

Each circle must have a different color.  New colors can be created and used with
  Color myColor = new Color(a, b, c);  g.SetColor(myColor);
where a, b, and c are floating point numbers, as described here:
  https://docs.oracle.com/en/java/javase/11/docs/api/java.desktop/java/awt/Color.html#%3Cinit%3E(float,float,float)

It is up to you to decide what colors to display in each circle, as long as every circle has a different color.  The colors in the attached image are selected at random.

C. The textbook, in Section 4.3, has an InvestmentTable.java program that prints the balance of an investment at a fixed interest rate.

Please write a similar program that calculates the repayment period for a credit card (or other) debt, assuming a fixed yearly interest rate and fixed yearly payment.  Your program should be called Repayment.java, and should have a method that calculates the new balance:

  public static double newBalance(double oldBalance, double totalPayments, double interestRate)

The overall program (your main method, not newBalance) should print the balance each year until the debt is paid off, or up to ten years, whichever comes first.  All the parameters must be read from the user, as in these examples.  Note that the yearly repayment is simply 12 times the monthly repayment, and the interest is 1/100 of the interest rate in percent.  Be sure to subtract the repayment before calculating the interest.

  total amount: 10000.00
  monthly repayment: 500.0
  interest rate, in percent: 9.8
   1    4392.00
   2       0.00

At the end of the first year, we subtract the $6,000 repaid ($500/month times 12 months), leaving $4,000.  The interest of 9.8% is then applied by multiplying $4,000 * 1.098, giving $4,392.  At the end of the second year, 4392.00 - 6000 is negative, so the balance is 0, assuming that payments stop once the debt is paid off.

With the same interest rate, but a lower repayment, the debt is still not completely paid back in 10 years -- most of the payments go to interest rather than to paying back the debt.

  total amount: 10000.00
  monthly repayment: 100
  interest rate, in percent: 9.8
   1    9662.40
   2    9291.72
   3    8884.70
   4    8437.80
   5    7947.11
   6    7408.33
   7    6816.74
   8    6167.18
   9    5453.97
  10    4670.85

In the same situation, but with a 0% interest rate, the debt is paid back in the 9th year.

  total amount: 10000.00
  monthly repayment: 100
  interest rate, in percent: 0.0
   1    8800.00
   2    7600.00
   3    6400.00
   4    5200.00
   5    4000.00
   6    2800.00
   7    1600.00
   8     400.00
   9       0.00

 
