package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball[] lotteryBalls = new Ball[3];
        Lottery lottery = new Lottery();
        for (int i = 0; i < lotteryBalls.length; i++) {
            lotteryBalls[i] = lottery.getRandomBall();
            System.out.println(lotteryBalls[i].toString());
        }
    }
}
