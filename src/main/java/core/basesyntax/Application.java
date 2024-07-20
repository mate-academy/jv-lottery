package core.basesyntax;

public class Application {
    public static final int BALL_AMOUNT = 3;
    public static final Lottery lottery = new Lottery();

    public static void main(String[] args) {
        for (int i = 0; i < BALL_AMOUNT; i++) {
            System.out.println(lottery.getRandomBall());
        }

    }
}
