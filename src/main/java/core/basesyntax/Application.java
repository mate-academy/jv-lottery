package core.basesyntax;

public class Application {

    private static final int num_ball = 3;

    public static void main(String[] args) {

        Ball[] balls = new Ball[num_ball];
        Lottery lottery = new Lottery();
        for (int i = 0; i < balls.length; i++) {
            balls[i] = lottery.getRandomBall();
        }
        for (Ball ball: balls) {
            System.out.println(ball);
        }

    }
}
