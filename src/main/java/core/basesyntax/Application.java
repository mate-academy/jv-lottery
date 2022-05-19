package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball[] balls = new Ball[3];

        for (int i = 0; i < 3; i++) {
            balls[i] = lottery.getRandomBall();
        }

        for (Ball ball : balls) {
            System.out.println(ball.toString());
        }

    }
}
