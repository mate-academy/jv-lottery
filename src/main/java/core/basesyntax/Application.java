package core.basesyntax;

public class Application {
    private static final int BALL_QUANTITY = 3;
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 0; i < BALL_QUANTITY; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
