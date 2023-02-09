package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        final static int BALL_LIMIT = 3;

        Lottery lottery = new Lottery();
        for (int i = 0; i < BALL_LIMIT; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
