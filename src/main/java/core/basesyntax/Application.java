package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball ballFirst = lottery.getRandomBall();
        Ball ballSecond = lottery.getRandomBall();
        Ball ballThird = lottery.getRandomBall();

        System.out.println(ballFirst);
        System.out.println(ballSecond);
        System.out.println(ballThird);
        // create three balls using class Lottery and print information about them in console
    }
}
