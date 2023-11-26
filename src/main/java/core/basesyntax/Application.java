package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Ball ball1 = Lottery.getRandomBall();
        Ball ball2 = Lottery.getRandomBall();
        Ball ball3 = Lottery.getRandomBall();

        // Print information about the balls in the console
        System.out.println(ball1);
        System.out.println(ball2);
        System.out.println(ball3);
    }
}
