package core.basesyntax;

public class Application {
    private static final int COUNT_OF_RANDOM_BALLS = 3;

    public static void main(String[] args) {
        for (int i = 1; i < COUNT_OF_RANDOM_BALLS + 1; i++) {
            System.out.println(i + ". " + new Lottery().getRandomBall());
        }
    }
}
