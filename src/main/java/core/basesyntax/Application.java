package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery lottery = new Lottery();

        Ball ball = lottery.getRandomBall();
        System.out.println(ball);
    }
}
