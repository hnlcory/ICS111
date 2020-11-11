Instructions
Homework Assignment 3.

Use the Assignments tool in Laulima to submit all assignments.  This assignment must be submitted before 12noon HST on Friday, September 18th, 2020.

Please attach the four requested programs below as your assignment submission.  For this assignment, your programs should be named TimePrint.java, Alphabetize.java, WaterState.java, and RentalRelief.java.

If you are in section 2 or section 6, the TA requests that you also submit screenshots of your code and output.

For every program, you should include comments that might be useful to the TA to understand how your program works, and also any comments that will remind yourself how your program works.  While for this assignment there is no requirement to list your name and section, it is common practice and a good habit to include the author's name at the beginning of a program.

For programming problems, you get full credit if your program compiles and runs correctly, and follows all instructions for naming and comments.  If your program is substantially complete and compiles correctly, you will get a score of at least 50% for that problem, even if at runtime the program is not completely correct.

A. Write a program (TimePrint.java) that reads a number of minutes from the user, then prints out either the same number if the minutes are less than 60, or otherwise the number of hours and minutes.  A few examples of running this program:

  Enter the number of minutes: 15
  You entered: 15 minutes

  Enter the number of minutes: 70
  You entered: 1 hour 10 minutes

  Enter the number of minutes: 120
  You entered: 2 hours

  Enter the number of minutes: 121
  You entered: 2 hours 1 minute

Your program must correctly print the hours and minutes, correctly using the singular form (minute instead of minutes, hour instead of hours) if there is just one hour or one minute.

Your program should also check that the number of minutes entered by the user is greater than 0 and less than 1440 (1440 is the number of minutes in a day).  If the number is 0 or less, or 1440 or more, your program should print "Number out of range" instead of "You entered: ...".

  Enter the number of minutes: 0
  Number out of range

For this program, you may benefit from using the % (modulo) operation.  For example, if you have a variable totalMinutes, then you can have code such as

  long hours = totalMinutes / 60;
  long minutes = totalMinutes % 60;

B. Write a program (Alphabetize.java) that prompts for and reads three strings from the user, and prints them out in alphabetical order.

You must use String.compareTo to determine alphabetical order.

Here is an example of running this program, with your program's prompts ("first string: ", "second string: ", "third string: "), the user input ("hello world", "abc", "xyz"), and the final output ("You entered: abc, hello world, xyz").

  first string: hello world
  second string: abc
  third string: xyz
  You entered: abc, hello world, xyz.

C. Write a program (WaterState.java) that prompts for a temperature, and prints whether the water is frozen, liquid, or steam at that temperature.  The user may specify F or C after the temperature.  If F is specified, the temperature tempF given by the user must be converted to C as follows:
tempC = Math.round((tempF - 32) * 5.0 / 9.0);

If neither F nor C is specified, the temperature is assumed to be in degrees C.

The water is frozen at or below 0C, steam at or above 100C, and liquid otherwise.

A few examples of running this program:

  temperature: 100
  at 100C, steam

  temperature: 99 C
  at 99C, water

  temperature: 31 F
  at -1C, ice

(this problem is inspired by programming exercise 3.9 in the book)

D. Write a program (RentalRelief.java) that helps a renter determine whether they qualify for pandemic rental relief, as described at https://www.hihousinghelp.com/

Your program only needs to compute rental relief for Honolulu County, listed in the first line of the table.

Your program must prompt the user for household size and income level, and either print
  "A ...-person household with income of ... is eligible for rental relief",
or print
  "A ...-person household with income of ... is not eligible for rental relief".

Incomes at or below the level shown in the accompanying table are eligible for rental relief.  If the user enters a household size greater than 10, use the value for 10, and print "A 10-person household...".  Similarly, if the user enters a household size less than 1, use the value for 1 and print "A 1-person household...".

A few examples of running this program:

  household size: 3
  total household income: 113400
  A 3-person household with income of 113400 is eligible for rental relief

  household size: 3
  total household income: 113401
  A 3-person household with income of 113401 is not eligible for rental relief

  household size: 22
  total household income: 200000
  A 10-person household with income of 200000 is not eligible for rental relief

The table:

Household size       1         2         3         4         5         6         7         8         9        10

Honolulu       $88,200  $100,800  $113,400  $125,900  $136,000  $146,100  $156,200  $166,200  $176,300  $186,400
Hawaii Island  $58,400   $66,700   $75,000   $83,300   $90,000   $96,700  $103,300  $110,000  $116,700  $123,300
Kauai          $68,000   $77,700   $87,400   $97,100  $104,900  $112,700  $120,500  $128,200  $136,000  $143,800
Maui           $71,800   $82,000   $92,300  $102,500  $110,700  $118,900  $127,100  $135,300  $143,500  $151,700
