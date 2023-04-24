package core.basesyntax;

public class Application {
    private static final int NUMBER_OF_TRY = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 1; i <= NUMBER_OF_TRY; i++) {
            System.out.println(i + ". " + lottery.getRandomBall());
        }
    }
}
