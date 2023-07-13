package core.basesyntax;

public class Application {
    private static final int BALL_LIMIT = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 0; i < BALL_LIMIT; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
