package core.basesyntax;

public class Application {
    private static final int COUNT_OF_BALLS = 3;

    public static void main(String[] args) {
        for (int i = 1; i <= COUNT_OF_BALLS; i++) {
            System.out.println(new Lottery().getRandomBall());
        }
    }
}
