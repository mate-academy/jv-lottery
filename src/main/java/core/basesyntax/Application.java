package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery firstBall = new Lottery();
        Lottery secondBall = new Lottery();
        Lottery thirdBall = new Lottery();
        getLotteryBalls(firstBall,secondBall,thirdBall);
    }

    public static void getLotteryBalls(Lottery... lotteries) {
        for (Lottery lottery : lotteries) {
            lottery.getRandomBall();
        }
    }
}
