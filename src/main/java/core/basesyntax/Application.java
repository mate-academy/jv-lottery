package core.basesyntax;

public class Application {
    public static void main(String[] args) {

        Lottery[] lotteries = {
                new Lottery(),
                new Lottery(),
                new Lottery()
        };

        for (Lottery lottery : lotteries) {
            Ball ball = lottery.getRandomBall();
            System.out.println(ball);

        }
    }
}
