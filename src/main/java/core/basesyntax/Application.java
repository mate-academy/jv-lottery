package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery lottery = new Lottery();
        Ball[] balls = new Ball[3];
        balls[0] = lottery.getRandomBall();
        balls[1] = lottery.getRandomBall();
        balls[2] = lottery.getRandomBall();

        for (Ball ball : balls) {
            System.out.println(ball.toString());
        }
    }
}
