package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball[] randomBalls = {Lottery.getRandomBall(),
                Lottery.getRandomBall(),
                Lottery.getRandomBall()};
        for (Ball ball: randomBalls) {
            System.out.println(ball);
        }
    }
}
