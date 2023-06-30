package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        final int ballCount = 3;
        Lottery lottery = new Lottery();
        Ball[] balls = new Ball[ballCount];
        for (int i = 0; i < balls.length; i++) {
            balls[i] = new Ball();
            balls[i] = lottery.getRandomBall();
            System.out.println("Ball - " + balls[i].toString());
        }
    }
}
