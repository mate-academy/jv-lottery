package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery lottery = new Lottery();
        Ball ball1 = lottery.getRandomBall();
        System.out.println(ball1);
        Ball ball2 = lottery.getRandomBall();
        System.out.println(ball2);
        Ball ball3 = lottery.getRandomBall();
        System.out.println(ball3);
    }
}
