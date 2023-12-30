package core.basesyntax;

public class Application {
    private static final int maxLotteryBallsAllowed = 3;

    public static void main(String[] args) {
        Ball[] lotteryBalls = new Ball[maxLotteryBallsAllowed];
        Lottery lottery = new Lottery();
        for (int i = 0; i < maxLotteryBallsAllowed; i++) {
            lotteryBalls[i] = lottery.getRandomBall();
            System.out.println(lotteryBalls[i].toString());
        }
    }
}
