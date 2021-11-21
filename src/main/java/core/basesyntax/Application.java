package core.basesyntax;

public class Application {
    private static final int NUMBER_0F_LOTTERIES = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();

        Ball[] balls = new Ball[NUMBER_0F_LOTTERIES];

        for (Ball randomBall : balls) {
            randomBall = lottery.getRandomBall();
            System.out.println("The ball number: " + randomBall.getNumber()
                    + " has color: " + randomBall.getColor());
        }
    }
}
