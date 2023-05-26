package core.basesyntax;

public class Application {
    private static final int COUNT_OF_RANDOM_BALLS = 3;

    public static void main(String[] args) {
        for (int i = 0; i < COUNT_OF_RANDOM_BALLS; i++) {
            System.out.println((i + 1) + ". " + new Lottery().getRandomBall());
        }
    }
}
