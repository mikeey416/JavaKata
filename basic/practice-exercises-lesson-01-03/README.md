## Practice Exercises from Lesson 01 to 03


### Exercise 1
Create a java program that accepts two integer values. It should 
print the results of adding, subtracting, multiplying, and dividing 
among the two values.

Sample output:

```bash
Please enter first integer: 10
Please enter second integer: 5

Addition result is 15.

Subtraction result is 5.

Multiplication result is 50.

Division result is 2.
```

**Note**: You may use Scanner.nextInt to read integer from terminal.

### Exercise 2

Modify the program in `practice-exercises-lesson-01-03/src/Exercise2.java`
and use Compound Assignment Operators. The output should stay the same.

### Exercise 3

Create a java program that accepts an integer.
Using the arithmetic operator modulo(%), identify if the number 
is an odd or even number.

Sample outputs:

```bash
Please enter an integer: 8

Is 8 even number? true
Is 8 odd number? false 
```

```bash
Please enter an integer: 5

Is 5 even number? false
Is 5 odd number? true 
```

**Note**: Do not use if expression and instead use boolean expression.

### Exercise 4

Same program as Exercise 4, but this time a different expected output.

Sample outputs:

```bash
Please enter an integer: 8

8 is an even number.
```

```bash
Please enter an integer: 5

5 is an odd number.
```

**Note**: Do not use if expression. You can use a ternary operator.
```java
int age = 20;
String ageGroup = age > 19 ? "matanda" : "binata"; 
```

### Exercise 5

Write a Java program to takes the user for a distance (in meters) 
and the time was taken (as three numbers: hours, minutes, seconds), 
and display the speed, in meters per second, kilometers per hour 
and miles per hour (hint: 1 mile = 1609 meters).

Sample Input:
```bash
Please enter distance in meters: 2500
Please enter hour: 5
Please enter minutes: 56
Please enter seconds: 23
```
Expected Output :
```bash
Your speed in meters/second is 0.11691531
Your speed in km/h is 0.42089513
Your speed in miles/h is 0.26158804
```

### Exercise 6

Write a Java program that reads a number and display the square, cube, and fourth power.

Sample Output
```bash
Please enter an integer: 2

Square: 4
Cube: 8
Fourth power: 16
```

### Exercise 7

Modify the program in `practice-exercises-lesson-01-03/src/Exercise7.java`,
convert min and max as constants.

### Exercise 8
Using the program from Exercise 7. Accept a number from the user to guess the
random number.  
If the user input is:
equal to the random number: Output is `Your guess is correct!`
higher than the random number:  Output is `Your guess is higher!`
lower than the random number:  Output is `Your guess is lower!`

**Note**: Do not use if expression. You can use a ternary operator.
**Clue**: You may use the ternary operator twice.
```java

int age = 20;
String ageGroup = "";
ageGroup = age < 13 ? "bata" : ageGroup;
ageGroup = age < 19 ? "teenager" : "matanda";
```

### Exercise 9

Modify `Exercise 1`, create separate static method for addition, subtraction,
multiplication and division.

### Exercise 10
A class called circle has:

- instance field of radius.
- getter and setter of radius field. 
- instance method that computes and returns the circumference.
- instance method that computes and returns the diameter.

Create an app the accepts a number. Creates a circle object by setting the radius with
the number entered. Printing the circumference and diameter computer from the circle
object.

Sample output:
```bash
Please enter the radius: 5

The circumference is 31.4159
The diameter is 10.
```

Note 

      Circumference = 2 x PI x radius
      Diameter =  PI x (radius x radius)
      
### Exercise 11

`The MyTime Class`

A class called MyTime, which models a time instance.

It contains the following private instance variables:

- hour: between 0 to 23.
- minute: between 0 to 59.
- second: between 0 to 59.

It contains the following public methods:

- Setters setHour(int hour), setMinute(int minute), setSecond(int second)

- Getters getHour(), getMinute(), getSecond() with int return type.

- toString(): returns time `String` in format "HH:MM:SS"

Write the code for the MyTime class. Also write a Test class(called TestMyTime) containing the main method to use MyTime class.