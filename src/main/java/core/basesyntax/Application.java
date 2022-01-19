package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball[] lotteryBalls = new Ball[3];
        for (int i = 0; i < lotteryBalls.length; i++) {
            lotteryBalls[i] = new Lottery().getRandomBall();
            System.out.println(lotteryBalls[i].toString());
        }
    }
}
