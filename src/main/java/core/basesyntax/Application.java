package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball firstBall = new Ball();
        Ball secondBall = new Ball();
        Ball thirdBall = new Ball();
        Ball[] balls = new Ball[] {firstBall, secondBall, thirdBall};
        for (Ball ball : balls) {
            ball = lottery.getRandomBall();
            System.out.println(ball);;
        }
    }
}
