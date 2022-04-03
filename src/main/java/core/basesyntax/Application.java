package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery firstBall = new Lottery();
        Lottery secondBall = new Lottery();
        Lottery thirdBall = new Lottery();

        Lottery[] lotteries = new Lottery[3];
        lotteries[0] = firstBall;
        lotteries[1] = secondBall;
        lotteries[2] = thirdBall;

        for (Lottery lotteries1:lotteries) {
            System.out.println(lotteries1.getRandomBall());
        }
    }
}
