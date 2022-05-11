package core.basesyntax;

public class Application {
    public static final int BALLS_MAX = 3;

    public static void main(String[] args) {
       Ball[] balls = new Ball[BALLS_MAX];
        Lottery lottery = new Lottery();
        for (int i = 0; i < balls.length; i++) {
            balls[i] = lottery.getRandomBall();
        }
        for (Ball ball: balls) {
            System.out.println(ball);
        }
    }
}
