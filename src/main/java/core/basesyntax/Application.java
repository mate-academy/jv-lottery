package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Ball firstball = Lottery.getRandomBall();
        System.out.println("First ball color is " + firstball.getColor()
                + " and number is " + firstball.getNumber());
        Ball secondball = Lottery.getRandomBall();
        System.out.println("First ball color is " + secondball.getColor()
                + " and number is " + secondball.getNumber());
        Ball thirdball = Lottery.getRandomBall();
        System.out.println("First ball color is " + thirdball.getColor()
                + " and number is " + thirdball.getNumber());
    }
}
