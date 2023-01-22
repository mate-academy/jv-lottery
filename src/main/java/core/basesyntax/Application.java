package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Ball ballFirst = Lottery.getRandomBall();
        Ball ballSecond = Lottery.getRandomBall();
        Ball ballThird = Lottery.getRandomBall();
        System.out.println(ballFirst);
        System.out.println(ballSecond);
        System.out.println(ballThird);
    }
}