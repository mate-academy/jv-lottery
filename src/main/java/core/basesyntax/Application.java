package core.basesyntax;

public class Application {
    private final static int numLotteryBalls = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 0; i < numLotteryBalls; i++) {
            System.out.println(lottery.getRandomBall().toString());
        }
    }
}
