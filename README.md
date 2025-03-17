# Laboratory 1 - Introduction

Write a Java program that fulfills the following requirements. NB! Command-line arguments can be both strings and integers. These arguments will be set using the Run Configuration... screen in IntelliJ IDEA or another IDE.

1. Display the prime numbers found among the command-line arguments of the program. If the program is started without providing at least one argument in the command line, read these values through the user interface.

2. Display the perfect squares found among the command-line arguments of the program. If the program is started without providing at least one argument in the command line, read these values through the user interface.

3. Display the greatest common divisor of all natural numbers found among the command-line arguments of the program. If the program is started without providing at least one argument in the command line, read these values through the user interface.
 
4. Display the least common multiple of all natural numbers found among the command-line arguments of the program. If the program is started without providing at least one argument in the command line, read these values through the user interface.

5. Display, in ascending order of length (one per line), all strings that do not represent numbers and are found among the command-line arguments of the program. If the program is started without providing at least one argument in the command line, read these values through the user interface.

6. Display, in descending lexicographical order (one per line), all strings that do not represent numbers and are found among the command-line arguments of the program. If the program is started without providing at least one argument in the command line, read these values through the user interface.

7. Display, in ascending order (one per line), all strictly negative numbers found among the command-line arguments of the program. If the program is started without providing at least one argument in the command line, read these values through the user interface.

# Examples
For the first problem, given the command-line arguments:
`1 4 abcd 3 10 99 11 Java Advanced Programming Methods 45 13`
The program will display:
`3 11 13`

If no useful arguments are provided (e.g., only strings that do not represent natural numbers), or if no arguments are provided at all, the program should prompt the user to enter arguments via the command line, then compute and display the results.

# Non-functional Requirements
- Separate the implementation into functions that accept parameters and return values.

- The determination of values to be displayed must be done using a function that receives input parameters and returns the result. This function should be separate from functions that read input or display the result on the screen.
