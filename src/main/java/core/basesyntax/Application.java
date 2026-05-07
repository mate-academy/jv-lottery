package core.basesyntax;

public class Application {
    private static final int AMOUNT_OF_BALLS = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball[] balls = new Ball[AMOUNT_OF_BALLS];

        for (int i = 0; i < balls.length; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}

