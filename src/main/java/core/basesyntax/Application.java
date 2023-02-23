package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Ball ball1 = Lottery.getRandomBall();
        Ball ball2 = Lottery.getRandomBall();
        Ball ball3 = Lottery.getRandomBall();

        System.out.println("Ball 1: " + ball1);
        System.out.println("Ball 2: " + ball2);
        System.out.println("Ball 3: " + ball3);
    }
}
