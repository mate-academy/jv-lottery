package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        final int COUNT = 5;

        for (int i = 0; i < COUNT; i++) {
            System.out.println(new Lottery().getRandomBall());
        }
    }
}
