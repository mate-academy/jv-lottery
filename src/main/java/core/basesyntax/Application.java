package core.basesyntax;

public class Application {
    private static final int LOOPS_COUNT = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();

        for (int i = 0; i < LOOPS_COUNT; i++) {
            Ball newBall = lottery.getRandomBall();

            System.out.println(newBall);
        }
    }
}
