package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        int QTY_OF_BALLS = 3;

        for (int i = 0; i < QTY_OF_BALLS;i++) {
            System.out.println(new Lottery().getRandomBall());
        }
    }
}