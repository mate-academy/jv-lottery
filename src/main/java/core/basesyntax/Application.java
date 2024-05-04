package core.basesyntax;

public class Application {
    private static final int PRINT_COUNTER = 10;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 0; i < PRINT_COUNTER; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
