package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball[] randomBalls = new Ball[3];
        for (int i = 0; i < randomBalls.length; i++) {
            randomBalls[i] = lottery.getRandomBall();
        }
        for (Ball ball : randomBalls) {
            System.out.println(ball);
        }
    }
}
