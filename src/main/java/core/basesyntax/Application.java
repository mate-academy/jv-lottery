package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball[] randomBalls = new Ball[]{new Lottery().getRandomBall(), new Lottery().getRandomBall(), new Lottery().getRandomBall()};
        for (Ball ball : randomBalls) {
            System.out.println(ball.toString());
        }
    }
}
