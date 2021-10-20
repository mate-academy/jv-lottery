package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery lottery = new Lottery();
        Ball firstBall = lottery.getRandomBall();
        Ball secondBall = lottery.getRandomBall();
        Ball thirdBall = lottery.getRandomBall();

        Ball[] balls = new Ball[3];
        balls[0] = firstBall;
        balls[1] = secondBall;
        balls[2] = thirdBall;

        for (Ball ball : balls) {
            System.out.println(ball.toString());
        }
    }
}
