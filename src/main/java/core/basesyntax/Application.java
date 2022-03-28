package core.basesyntax;

public class Application {
    public static void main(String[] argsgit) {
        Ball[] balls = new Ball[3];
        for (int i = 0; i < balls.length; i++) {
            balls[i] = new Lottery().getRandomBall();
        }
        for (Ball ball: balls) {
            System.out.println(ball);
        }
    }
}
