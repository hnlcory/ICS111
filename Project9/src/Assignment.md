Homework Assignment 9.

Use the Assignments tool in Laulima to submit all assignments.  This assignment must be submitted before 12noon HST on Friday, October 30th, 2020.

Please attach the 2 requested programs below as your assignment submission.  For this assignment, your programs should be named ArrayTen.java and Median.java.

If you are in section 2 or section 6, the TA requests that you also submit screenshots of your code and output.

A. Add code (see below for details) to the methods "set" and "get" in the following class, ArrayTen.java, so that these two methods catch the exception java.lang.ArrayIndexOutOfBoundsException if an illegal index is used, and in turn throw java.lang.IndexOutOfBoundsException instead.

Modify the "main" method to catch java.lang.IndexOutOfBoundsException and, when such an exception is caught, print the exception as well as the stack trace.

public class ArrayTen {

  private String myData[] = new String[10];

  public void set(int index, String value) {
    myData[index] = value;
  }

  public String get(int index) {
    return myData[index];
  }

  public static void main(String[] args) {
    ArrayTen a = new ArrayTen();
    a.set(10, "hello world");
    System.out.println (a.get(10));
  }

}

The expected output from your successful modification will be:

exception java.lang.IndexOutOfBoundsException
java.lang.IndexOutOfBoundsException
    at ArrayTen.set(ArrayTen.java:10)
    at ArrayTen.main(ArrayTen.java:25)

**Adding code means you are not allowed to modify or delete any of the existing code statements.  You must add "try" and "catch" and any additional code needed to fulfill the requirements, without modifying the existing statements.

B. Write a program Median.java to read each file whose name is specified in the command-line arguments.  That is, for each command-line argument, open it as a file and read it.

The file contents are zero or more lines each containing a list of comma-separated integers, such as 1,2,3,4 or 99,120,33.  You should parse each of these integers and save them in an ArrayList (if you prefer you may use an array, but an ArrayList is likely to be easier for this assignment).

Once you have filled your array list with all the integers in the line, you must compute the median value, that is, the integer for which half the integers in the line are above it, and half are below it.  There are two subtleties that you should handle correctly:

- each integer may appear more than once: in 1,1,2,2,3, the median is 2

- with an even number of integers, the median may be the average of two of the integers: in 1,2,3,4, the median is 2.5

You must implement and use a method whose header is one of
  private static double computeMedian(java.util.ArrayList<Integer> numbers)
or
  private static double computeMedian(Integer[] numbers)
or
  private static double computeMedian(int[] numbers)

to compute and return the median of all the numbers.

An algorithm to compute the median is as follows:

- for each number in the ArrayList (or array), compare it to all the numbers in the array, computing how many are above it, how many are below it, and how many are the same -- at least one (itself) should be the same.

- then if (the number below plus the number equal are greater than the number above) AND (the number below is less than the number equal plus the number above) then this number is the median.

For example, in 1,1,2,2,3:

- for the number 1, there are 0 numbers below, 2 numbers that are equal, and 3 numbers above, so 1 is not the median.

- for the number 2, there are 2 numbers below, 2 numbers that are equal, and 1 numbers above, so 2 is the median.

- for the number 3, there are 4 numbers below, 1 number that is equal, and 0 numbers above, so 3 is not the median.

On the other hand, if (the number below plus the number equal is the same as the number above) OR (the number below is the same as the number equal plus the number above) then this is one of two numbers, the average of which is the median.

For example, in 1,2,3,4,5,2, for the number 2, there is one number below and two numbers equal, which is the same as the three number above.  For the number 3, there is one number equal and two numbers above, which is the same as the three numbers below.  So in this case the median is the average of 2 and 3: mathematically, (2 + 3) / 2 = 2.5 (remember the division must be done using doubles, otherwise the result will be truncated).

To correctly implement this part of the computation, you need to have one or more variables declared outside the main loop, to keep track of whether you have already seen one of the two numbers whose average is the mean.  In the example above, once you see 3 (after seeing 2), you should be able to immediately return the median 2.5.  Be careful -- if you see another 2 (before seeing the 3), as in processing 2,2,1,3,5,4, you must continue your search past the second 2.

Your code must use this algorithm to find the median.  There exists a much easier way to find the median, which is to sort the array and look in the middle -- you are not allowed to use sort, and instead you must use the algorithm described here.

In addition to finding the median, your program must correctly handle all exceptions that may be generated as the result of files not existing, files not containing comma-separated lists of integers, or any other exceptions.  Your program must catch and correctly handle every exception, print a sensible message in each case, and continue on to the next file.

Although the two problems get equal credit, this second problem is much harder than the first problem, and requires you to practice many of the things we have learned so far in this course.
