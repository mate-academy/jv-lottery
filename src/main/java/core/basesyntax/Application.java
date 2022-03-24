package core.basesyntax;

public class Application {
    private static final int COUNT = 5;

    public static void main(String[] args) {
        for (int i = 0; i < COUNT; i++) {
            System.out.println(new Lottery().getRandomBall());
        }
    }
}
