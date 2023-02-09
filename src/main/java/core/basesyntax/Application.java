package core.basesyntax;

public class Application {
    private static final int MAX_BALLS = 3;
    private static final int START_INDEX  = 0;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = START_INDEX; i < MAX_BALLS; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
