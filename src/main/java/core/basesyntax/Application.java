package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        int numberOfBalls = 3;
        Ball[] lotteryBalls = new Ball[numberOfBalls];
        for (int i = 0; i < numberOfBalls; i++) {
            Lottery randomBall = new Lottery();
            lotteryBalls[i] = randomBall.getRandomBall();
            System.out.println(lotteryBalls[i].toString());
        }
    }
}
