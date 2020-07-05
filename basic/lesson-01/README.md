# Lesson-01

## Goal

* To understand that to run a java program, it needs a class with a `main` method with this signature 
````java
public static void main(String[] args)
````
* The name of the class should be the same as the file name
* The file should have extension of `.java`
* To understand the java compiler
* To understand the three types of comments: inline, multi-line and java doc.
* To understand a java package
* To understand importing classes
* To understand sequential flow



## Exercises

### Exercise 01

 1. Code the class declaration with class name FirstExercise
 2. Add javadoc comment with this format,  @author <YourNameHere>
 3. Add the main method and inside it add the code System.out.println("YourName");
 4. use `javac FirstExercise.java` in terminal to compile it
 5. use `java FirstExercise` to run
 
 
### Exercise 02

 1. Create a new file with name SecondExercise.java under `main-class-exercise/src` where FirstExercise.java is.
 2. Same as the first exercise, code the class declaration, and include the main method.
 3. Add System.out.println("YourName") inside the main method
 4. Now create a package under `main-class-exercise/src`, the package name is `com.java.kata.lesson01.second`.
 5. Transfer the SecondExercise.java to that package you've created.
 6. Fix the package declaration inside the code of SecondExercise.java
 7. use `javac SecondExercise.java` in terminal to compile it
 8. use `java SecondExercise` to run