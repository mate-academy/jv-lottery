package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery lottery = new Lottery();

        Ball ball1 = new Ball(lottery.getRandomBall().getColor(), 7);
        Ball ball2 = new Ball(lottery.getRandomBall().getColor(), 3);
        Ball ball3 = new Ball(lottery.getRandomBall().getColor(), 5);

        System.out.println(ball1);
        System.out.println(ball2);
        System.out.println(ball3);
    }
}
