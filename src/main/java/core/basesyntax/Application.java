package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery firstBall = new Lottery();
        Lottery secondBall = new Lottery();
        Lottery thirdBall = new Lottery();
        Lottery [] randomBalls = {firstBall, secondBall, thirdBall};
        for (Lottery ball : randomBalls) {
            System.out.println(ball.getRandomBall());
        }
    }
}
