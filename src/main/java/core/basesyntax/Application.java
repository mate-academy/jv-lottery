package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery ballFirst = new Lottery();
        Lottery ballSecond = new Lottery();
        Lottery ballThird = new Lottery();
        System.out.println(ballFirst.getRandomBall());
        System.out.println(ballSecond.getRandomBall());
        System.out.println(ballThird.getRandomBall());

    }
}
