package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball[] balls = new Ball[]{
                new Lottery().getRandomBall(),
                new Lottery().getRandomBall(),
                new Lottery().getRandomBall()
        };
        for (Ball ball : balls) {
            System.out.println(ball);
        }
    }
}
