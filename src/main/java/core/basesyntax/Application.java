package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery ball = new Lottery();
        Ball ball1 = ball.getRandomBall();
        Ball ball2 = ball.getRandomBall();
        Ball ball3 = ball.getRandomBall();
        Ball[] balls = {ball1, ball2, ball3};
        for (Ball ballI : balls) {
            System.out.println(ballI.toString());
        }
    }
}
