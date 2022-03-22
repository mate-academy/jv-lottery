package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball[] lotteryResult = new Ball[3];
        for (int i = 0; i < lotteryResult.length; i++) {
            lotteryResult[i] = lottery.getRandomBall();
            System.out.println(lotteryResult[i]);

        }
        // create three balls using class Lottery and print information about them in console
    }
}
