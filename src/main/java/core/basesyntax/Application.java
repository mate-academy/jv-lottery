package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Ball[] lotteryBalls = new Ball[3];
        Lottery lottery = new Lottery();
        for (int i = 0; i < lotteryBalls.length; i++) {
            lotteryBalls[i] = lottery.getRandomBall();
            System.out.println(lotteryBalls[i]);
        }
    }
}
