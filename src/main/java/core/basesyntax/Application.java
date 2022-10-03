package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        int numberOfBalls = 3;
        Lottery lotteryBall = new Lottery();
        Ball[] lotteryBalls = new Ball[numberOfBalls];
        for (int i = 0; i < numberOfBalls; i++) {
            lotteryBalls[i] = lotteryBall.getRandomBall();
            System.out.println(lotteryBalls[i].toString());
        }
    }
}
