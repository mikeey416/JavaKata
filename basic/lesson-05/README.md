# Lesson-05

## Goal
* Automatically Imported Packages, Prewritten Constants
  and Methods (Joyce Farrel - Chapter 4 p.206-213)
* Classes Are Data Types (Joyce Farrel - Chapter 3 p.154-156)
* Composition and Inner Classes (Joyce Farrel - Chapter 4 p.216-218)


## Lesson-05 Exercises

### Exercise 1
Using java.time.LocalDateTime, print the current hour and minute only.
You have to use the LocalDateTime getter for hour and minute.
Display it in 24-hour format HH:mm. 
Use ternary operator to check if you need to add zero at the start.

Output:
 
````
Current time is 12:05.
````

### Exercise 2a

Create a FitnessTracker class that includes data fields:
a. name of fitness activity
b. the number of minutes spent
c. and the date. 
The class includes methods to get each field. 
In addition, create a default constructor that automatically sets the activity to `running`, the minutes to 0, and the date to
January 1 of the current year. Do not use hardcoded year, use LocalDate.
Save the class with name `FitnessTracker`. 
Create main class named `TestFitnessTracker` to print a FitnessTracker with the default value.

Output
````
Fitness activity is running.
Spent minutes i 0.
Year is January 1, 2020
````

### Exercise 2b

Create an additional overloaded constructor for the `FitnessTracker` class
from the Exercise 2a. This constructor receives parameters for each of
the data fields and sets them to the private fields appropriately.
On the main class named `TestFitnessTracker`, create a FitnessTracker object 
calling the overloaded constructor, then print it. It should show the values
same as the parameters passed on the overloaded constructor.

````java
FitnessTracker fitnessTracker = new FitnessTracker("hiking", 10, LocalDate.of(2019, 02, 02));
````

Output
````
Fitness activity is running.
Spent minutes i 0.
Year is February 2, 2020
````

### Exercise 3

Create a class named Circle with fields named radius, diameter, and area.
Include a constructor that sets the radius to 1 and calculates the diameter and area
based on the radius. Also include methods named setRadius() and getRadius(). The
setRadius() method not only sets the radius, but it also calculates the other 
two values. 

(The diameter of a circle is twice the radius, and the area of a circle is pi multiplied by the square of the radius. Use the Math class PI constant
for this calculation.) 

Name of class is Circle.

### Exercise 4
Create a class named Person that holds the following fields: 
a. firstName
b. lastName 
c. birthdate using LocalDate

Create a class named Couple that contains two Person objects. 
Create a class named Wedding for a wedding planner that includes 
a. the date of the wedding,
b. the Couple object being married
c. and a String for the location. 

Provide constructors for each class that accept parameters for each field, and provide get
methods for each field. 

Then write a main class `TestWedding` that creates a Wedding object and other objects and print the Wedding
object using toString() method. 

Save the files as Person.java, Couple.java, Wedding.java, and TestWedding.java.

Output:

```
Wedding date: January 9, 2021
Couple is Jack Santos and Jill Cruz
Venue is Pampanga
```