package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
    Lottery firstBall = new Lottery();
    Lottery secondBall = new Lottery();
    Lottery thirdBall = new Lottery();
//    firstBall.getRandomBall();
    getLotteryBalls(firstBall,secondBall,thirdBall);
    }
    public static void getLotteryBalls(Lottery ... lotteries) {
        for (Lottery lottery : lotteries) {
            lottery.getRandomBall();
        }
    }
}
