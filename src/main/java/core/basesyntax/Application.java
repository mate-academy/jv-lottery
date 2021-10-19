package core.basesyntax;

public class Application {
    private static final int LIMIT = 3;

    public static void main(String[] args) {
        Ball[] balls = new Ball[LIMIT];
        Lottery lottery = new Lottery();
        for (int i = 0; i < balls.length; i++) {
            balls[i] = lottery.getRandomBall();
            System.out.println(balls[i]);
        }
    }
}
