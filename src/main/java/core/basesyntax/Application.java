package core.basesyntax;

public class Application {
    public static final int BALL_COUNT = 3;

    public static void main(String[] args) {
        for (int i = 0; i < BALL_COUNT; i++) {
            System.out.println(new Lottery().getRandomBall());
        }
    }
}
