package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball[] randomBalls = new Ball[3];
        for (int i = 0; i < randomBalls.length; i++) {
            randomBalls[i] = new Ball();
            randomBalls[i] = randomBalls[i].getRandomBall();
        }
        for (Ball ball: randomBalls) {
            System.out.println(ball.toString());
        }
    }
}
