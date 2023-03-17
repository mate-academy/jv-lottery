package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball ball1 = new Lottery().getRandomBall();
        Ball ball2 = new Lottery().getRandomBall();
        Ball ball3 = new Lottery().getRandomBall();
        System.out.println(ball3);
        System.out.println(ball2);
        System.out.println(ball1);
        // create three balls using class Lottery and print information about them in console
    }
}
