package core.basesyntax;

public class Application {
    private static final byte ARR_SIZE = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 0; i < ARR_SIZE; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
