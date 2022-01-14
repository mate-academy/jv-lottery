package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery firstLottery = new Lottery();
        Lottery secondLottery = new Lottery();
        Lottery thirdLottery = new Lottery();

        Ball firstBall = firstLottery.getRandomBall();
        Ball secondBall = firstLottery.getRandomBall();
        Ball thirdBall = firstLottery.getRandomBall();

        Ball[] arrayOfRandomBalls = new Ball[] {firstBall, secondBall, thirdBall};

        for (Ball ball : arrayOfRandomBalls) {
            System.out.println(ball.toString());
        }

    }
}
