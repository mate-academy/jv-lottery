package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        int i = 0;
        Ball ball = new Ball();
        while (i < 3) {
        ball = new Lottery().getRandomBall();
        ball.toString(ball);
        i++;
        }
    }
}
