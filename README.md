# jv-lottery

Let's create a simple lottery that will return balls with a random color and random number.

Your tasks are:
- create a `Ball` class with the following fields: `color` and `number` and override the `toString()` method
- create an enum with different color
- implement method `getRandomColor()` in class `ColorSupplier`. 
This method should return a random color, based on the enum values (use the `Random` class for this) 

Then create a `Lottery` class with the `getRandomBall()` method, which will return the ball.
This method should create a ball with a random color and a random number (the maximum possible number should be 100) and return this ball from the method.

To test the program, in the main() method, create three balls using the `getRandomBall()` method from the `Lottery` class.
And print information about them in the console.

#### [Try to avoid these common mistakes, while solving task](./checklist.md)
