package core.basesyntax;

public class Application {
    private static final int BALLS_NUMBER = 3;
    private static Lottery lottery = new Lottery();

    public static void main(String[] args) {
        for (int i = 0; i < BALLS_NUMBER; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
