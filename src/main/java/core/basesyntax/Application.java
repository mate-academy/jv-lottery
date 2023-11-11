package core.basesyntax;

public class Application {
    public static final int COUNT_BALL = 3;
    public static final int MAX_POSSIBLE_NUMBER_FOR_BALL = 100;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball [] balls = new Ball[COUNT_BALL];
        for (Ball resultBall: balls) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
