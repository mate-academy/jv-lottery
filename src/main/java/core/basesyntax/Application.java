package core.basesyntax;

public class Application {
    private static final int NUMBER_OF_BALLS = 3;
    private static final Lottery LOTTERY = new Lottery();

    public static void main(String[] args) {
        for (int i = 0; i < NUMBER_OF_BALLS; i++) {
            System.out.println(LOTTERY.getRandomBall());
        }
    }
}
