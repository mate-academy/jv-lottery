package core.basesyntax;

public class Application {
    private static final int NUMBER_OF_REPEAT = 3;
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 0; i < NUMBER_OF_REPEAT; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
