package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball firstBall = lottery.getRandomBall();
        Ball secondBall = lottery.getRandomBall();
        Ball thirdBall = lottery.getRandomBall();
        Ball[] balls = new Ball[]{firstBall,secondBall,thirdBall};
        for (Ball ball : balls) {
            System.out.println(ball.toString());
        }
    }
}
