package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        final int BALL_COUNT = 3;
        for (int i = 0; i < BALL_COUNT; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
