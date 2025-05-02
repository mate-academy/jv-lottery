package core.basesyntax;

public class Application {
    private static final int TEST_BALLS_QUANTITY = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 0; i < TEST_BALLS_QUANTITY; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
