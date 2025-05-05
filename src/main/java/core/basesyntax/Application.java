package core.basesyntax;

public class Application {
    private static final int BALL_COUNT = 3;

    public void main(String[] args) {
        for (int i = 0; i < BALL_COUNT; i++) {
            System.out.println(new Lottery().getRandomBall());
        }
    }
}
