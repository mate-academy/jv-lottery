package core.basesyntax;

public class Application {
    private static final int COUNT_BALL = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball[] balls = new Ball[COUNT_BALL];
        for (int i = 0; i < COUNT_BALL; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
