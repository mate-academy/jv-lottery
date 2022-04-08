package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        System.out.println(Lottery.getRandomBall().getBallInfo());
        System.out.println(Lottery.getRandomBall().getBallInfo());
        System.out.println(Lottery.getRandomBall().getBallInfo());
    }
}
