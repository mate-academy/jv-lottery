package core.basesyntax;

public class Application {
    private static final int AMOUNT = 3;

    public static void main(String[] args) {
        Lottery ball = new Lottery();
        for (int i = 0; i < AMOUNT; i++) {
            System.out.println(ball.getRandomBall());
        }
    }
}
