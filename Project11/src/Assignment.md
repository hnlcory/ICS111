Homework Assignment 11.

Use the Assignments tool in Laulima to submit all assignments.  This assignment must be submitted before 12noon HST on Friday, November 13th, 2020.

Please attach the 7 requested programs below as your assignment submission.  For this assignment, your programs should be named Person.java, ContactP.java, Employee.java, Manager.java, TestEM.java, MyRectangle.java and TestMyRectangle.java.

If you are in section 2 or section 6, the TA requests that you also submit screenshots of your code and output.

A. Create a new class Person (Person.java), which implements just part of the functionality of the Contact class from assignment 10:
- a constructor with a single String parameter, which saves that string as the name of the contact (this time there is no need for a no-arguments constructor)
- String toString(), which returns the name (similar to getName in assignment 10) -- this class must not have a getName method.
- boolean nameMatches(String search), which returns true if the lowercase version of the name (String.toLowerCase()) contains (String.contains(...)) the lowercase version of the search string

You are welcome to copy code from your Contact class (assignment 10) to this assignment's Person class.

You are strongly encouraged to modify your unit test code from assignment 10 to test the Person class, but do not turn in this unit test.

B.  Now create a ContactP class (ContactP.java) which is a subclass of Person, and provides all the methods of the Contact class.  The ContactP class must not have ANY instance variable recording the name of the person -- the name should be accessible through super.toString().  The ContactP class must override the toString method of Person so the return value is the same as described in part C.d of assignment 10.  Other than toString, ContactP must not override ANY methods inherited from Person.

As before, you are welcome to copy code from your Contact class (assignment 10) to this assignment's ContactP class, again making sure not to override the methods that are in Person (except for toString).

You are strongly encouraged to modify your unit test code from assignment 10 to test the ContactP class, but do not turn in this unit test.

C. Make a class Employee which is a subclass of the Person class from part A.  An Employee has a name (inherited from Person) and a salary (an int).

Make a class Manager which is a subclass of Employee.  A Manager inherits everything from Employee, and also has a department that they manage (a String).

Both Employee and Manager must provide a meaningful toString method.  You must also provide useful constructors and other methods.

Write a combined unit test for both Employee and Manager.  Turn in the files Employee.java, Manager.java, and EMTest.java.

Inspired by problem P9.9 in the textbook.

D. Extend the class java.awt.Rectangle to a class MyRectangle (MyRectangle.java) that has methods getPerimeter and getArea, to compute the perimeter (twice the height plus twice the width) and the area (the height times the width) of the rectangle.  MyRectangle has no instance variables, but should provide at least the two-argument constructor,

  public MyRectangle(int width, int height)

Write a unit test TestMyRectangle.java, to test your MyRectangle class, and turn in both MyRectangle.java and TestMyRectangle.java.

Inspired by problem P9.10 in the textbook.
