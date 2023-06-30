package core.basesyntax;

public class Application {
    private static final int NUM_OF_BALLS = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 0; i < NUM_OF_BALLS; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
