package core.basesyntax;

public class Application {
    private static final byte ARR_SIZE = 3;
    private static Lottery lottery = new Lottery();
    private static Ball[] balls = new Ball[ARR_SIZE];

    public static void main(String[] args) {
        for (int i = 0; i < ARR_SIZE; i++) {
            balls[i] = lottery.getRandomBall();
            System.out.println(balls[i]);
        }

    }
}
