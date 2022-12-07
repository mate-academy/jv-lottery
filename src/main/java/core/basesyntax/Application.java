package core.basesyntax;

public class Application {
    private static final int BALLS_QUANTITY = 3;

    public static void main(String[] args) {
        Lottery ball1 = new Lottery();
        for (int i = 0; i < BALLS_QUANTITY; i++) {
            System.out.println(ball1.getRandomBall());
        }
    }
}
