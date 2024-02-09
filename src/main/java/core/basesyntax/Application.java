package core.basesyntax;

public class Application {
    private static final int MAX_LOTTERY_BALLS_ALLOWED = 3;

    public static void main(String[] args) {
        Ball[] lotteryBalls = new Ball[MAX_LOTTERY_BALLS_ALLOWED];
        Lottery lottery = new Lottery();
        for (int i = 0; i < MAX_LOTTERY_BALLS_ALLOWED; i++) {
            lotteryBalls[i] = lottery.getRandomBall();
            System.out.println(lotteryBalls[i]);
        }
    }
}
