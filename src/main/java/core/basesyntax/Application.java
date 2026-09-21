package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery randomBall = new Lottery();
        Ball[] lotteryBall = new Ball[3];
        for (int i = 0; i < lotteryBall.length; i++) {
            lotteryBall[i] = randomBall.getRandomBall();
            System.out.println(lotteryBall[i]);
        }
    }
}
