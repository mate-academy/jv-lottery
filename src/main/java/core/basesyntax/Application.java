package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball[] balls = new Ball[]{new Ball(), new Ball(), new Ball()};
        for (Ball ball : balls) {
            ball = new Lottery().getRandomBall();
            System.out.println(ball);
        }
    }
}
