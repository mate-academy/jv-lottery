package core.basesyntax;

public class Application {
    private static final int BALLS_COUNT = 5;

    public static void main(String[] args) {

        Lottery lottery = new Lottery();
        lottery.getRandomBall();

        for (int i = 0; i < BALLS_COUNT; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
