package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        int ballsCapacity = 3;

        Lottery lottery = new Lottery();
        Ball[] balls = new Ball[ballsCapacity];

        for (int i = 0; i < ballsCapacity; i += 1) {
            balls[i] = lottery.getRandomBall();
        }

        for (Ball ball : balls) {
            System.out.println(ball);
        }
    }
}
