package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lotteryBall = new Lottery();
        Ball [] setOfBalls =
                {lotteryBall.getRandomBall(),
                 lotteryBall.getRandomBall(),
                 lotteryBall.getRandomBall()};

        for (Ball ball : setOfBalls) {
            System.out.println(ball);
        }
    }
}
