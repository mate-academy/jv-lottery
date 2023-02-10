package core.basesyntax;

public class Application {
    private static final int BALL = 3;

    public static void main(String[] args) {
        for (int i = 0; i < BALL; i++) {
            System.out.println(new Lottery().getRandomBall());
        }
    }
}
