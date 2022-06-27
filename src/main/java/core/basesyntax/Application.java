package core.basesyntax;

public class Application {

    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Ball ball1 = new Ball();
        ball1 = Lottery.getRandomBall();
        System.out.println(ball1.toString());
        Ball ball2 = new Ball();
        ball2 = Lottery.getRandomBall();
        System.out.println(ball2.toString());
        Ball ball3 = new Ball();
        ball3 = Lottery.getRandomBall();
        System.out.println(ball3.toString());
        Ball ball4 = new Ball();
        ball4 = Lottery.getRandomBall();
        System.out.println(ball4.toString());
        Ball ball5 = new Ball();
        ball5 = Lottery.getRandomBall();
        System.out.println(ball5.toString());
    }
}
