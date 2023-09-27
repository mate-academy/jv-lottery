package core.basesyntax;

public class Application {
    static final int NUMBER = 3;
    private static final Lottery lottery = new Lottery();

    public static void main(String[] args) {
        Ball[] balls = new Ball[NUMBER];
        for (Ball ball : balls) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
