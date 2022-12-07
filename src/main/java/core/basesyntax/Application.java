package core.basesyntax;

public class Application {
    private static final int MAX_RANDOM_NUMBER_BALL = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 1; i <= MAX_RANDOM_NUMBER_BALL; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
