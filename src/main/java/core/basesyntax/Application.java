package core.basesyntax;

public class Application {
    private static int COUNT_OF_BALL = 3;

    public static void main(String[] args) {
        Lottery[] lotteries = new Lottery[COUNT_OF_BALL];
        for (int i = 0;i < COUNT_OF_BALL;i++) {
            lotteries[i] = new Lottery();
        }
        for (Lottery index: lotteries) {
            System.out.println(index.getRandomBall());
        }
    }
}
