package core.basesyntax;

public class Application {
    private static final int FIGURE_COUNT = 3;
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 0; i < FIGURE_COUNT; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
