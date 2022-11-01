package core.basesyntax;

public class Application {
    private static final int MAX_VALUE = 3;
    private static Ball[] balls = new Ball[MAX_VALUE];
    private static Lottery lottery = new Lottery();

    public static void main(String[] args) {
        for (int i = 0; i < balls.length; i++) {
            balls[i] = lottery.getRandomBall();
        }
    }
}

