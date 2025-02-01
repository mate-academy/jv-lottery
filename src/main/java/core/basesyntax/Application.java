package core.basesyntax;

public class Application extends Lottery {
    private static final int NUMBER_OF_BALLS = 3;

    public static void main(String[] args) {
        Application app = new Application();
        for (int i = 0; i < NUMBER_OF_BALLS; i++) {
            System.out.println(app.getRandomBall());
        }

    }
}
