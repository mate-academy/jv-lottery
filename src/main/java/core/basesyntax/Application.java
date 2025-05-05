package core.basesyntax;

public class Application {
    private static final int FIGURE_COUNT = 3;
    private static Lottery lottery = new Lottery();

    public static void main(String[] args) {
        for (int i = 0; i < FIGURE_COUNT; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
