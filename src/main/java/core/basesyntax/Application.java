package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        int numberOfBalls = 3;
        Lottery lottery = new Lottery();
        Ball[] lotteryBalls = new Ball[numberOfBalls];
        for (int i = 0; i < numberOfBalls; i++) {
            lotteryBalls[i] = lottery.getRandomBall();
            System.out.println(lotteryBalls[i]);
        }
    }
}
