package core.basesyntax;
import java.util.Random;

public class Application {

    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Ball ball1 = new Ball();
        Ball ball2 = new Ball();
        Ball ball3 = new Ball();
        Ball ball4 = new Ball();
        Ball ball5 = new Ball();

        ball1 = Lottery.getRandomBall();
        ball2 = Lottery.getRandomBall();
        ball3 = Lottery.getRandomBall();
        ball4 = Lottery.getRandomBall();
        ball5 = Lottery.getRandomBall();

        System.out.println(ball1.toString());
        System.out.println(ball2.toString());
        System.out.println(ball3.toString());
        System.out.println(ball4.toString());
        System.out.println(ball5.toString());
    }
}
