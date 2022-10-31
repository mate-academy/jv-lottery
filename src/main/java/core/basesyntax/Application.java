package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball firstBall = new Lottery().getRandomBall();
        Ball secondBall = new Lottery().getRandomBall();
        Ball thirdBall = new Lottery().getRandomBall();

        Ball[] balls = {firstBall, secondBall, thirdBall};
        for (Ball ball : balls) {
            System.out.println(ball.toString());
        }
    }
}
