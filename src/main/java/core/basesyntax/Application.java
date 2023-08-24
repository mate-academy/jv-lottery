package core.basesyntax;

public class Application {
    private static final int NUMBER_OF_BALL = 3;

    public static void main(String[] args) {
        Lottery lotteryObject = new Lottery();
        for (int i = 0; i < NUMBER_OF_BALL; i++) {
            Ball b = lotteryObject.getRandomBall();
            System.out.println(b);
        }
    }
}
