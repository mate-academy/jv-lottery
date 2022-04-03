package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Ball ball_1 = Lottery.getRandomBall();
        System.out.println(ball_1);
        Ball ball_2 = Lottery.getRandomBall();
        System.out.println(ball_2);
        Ball ball_3 = Lottery.getRandomBall();
        System.out.println(ball_3);
    }
}
