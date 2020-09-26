## Practice Exercises from Lesson 04 to 06

Card Games

### Exercise 1
Design a Card class that contains a:
1. field name: suit
   data type: character primitive type
   possible values: (s for spades, h for hearts, d for diamonds,
                    or c for clubs) 
2. field name: rank
   data type: integer primitive type
   possible values: 1 - 13
   
Use the Card constructor to accept the suit and rank parameters,
that will be set to respective fields.
No setters and getters for suit and rank fields.
Use toString method return formatter values for printing.

Create a PickTwoCards class that contains the main method. 
Ask the user to input the suit.
Expect the user will enter a correct value.

```
Please enter the suit of the first card (s - spades, h - hearts, d - diamonds, or c - clubs)
```

Using Math.random, randomize the rank.

After two cards are created, check if which is has higher ranking or if they are equal.

Output the card values. Display also the result of comparison.

Sample Output2:

```
First card is 4 of spades.
Second card is 10 of hearts.

Second card is higher of rank.
```

```
First card is 9 of clubs.
Second card is 2 of spades.

First card is higher of rank.
```

```
First card is 6 of diamonds.
Second card is 6 of clubs.

Cards are of same rank.
```

### Exercise 2

Modify the Exercise 1.

You will have to randomize the suit too.
Since the suit is character and not a number, you have to randomize a number first
and then map it to corresponding suit.

Output is the same.




