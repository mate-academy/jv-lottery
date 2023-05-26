package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball ball = new Ball();
        Ball ball1 = new Ball();
        Ball ball2 = new Ball();
        Ball[] balls = new Ball[]{ball, ball1, ball2};
        for (int i = 0; i < balls.length; i++) {
            System.out.println(balls[i] = lottery.getRandomBall());
        }
    }
}
