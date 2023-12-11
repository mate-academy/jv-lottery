package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery lottery = new Lottery();
        Ball ball = new Ball();
        Ball ballFirst = new Ball();
        Ball ballSecond = new Ball();
        lottery.getRandomBall(ball);
        lottery.getRandomBall(ballFirst);
        lottery.getRandomBall(ballSecond);
        System.out.println(ball);
        System.out.println(ballFirst);
        System.out.println(ballSecond);
    }
}
