package core.basesyntax;

public class Application {
    private static final int NUMBERS_OF_BALL = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();

        for (int i = 0; i < NUMBERS_OF_BALL; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
