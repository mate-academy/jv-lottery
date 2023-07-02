package core.basesyntax;

public class Application {
    private static final int NUMBER_OF_USERS = 3;

    public static void main(String[] args) {
        Ball[] balls = {new Lottery().getRandomBall(),
                        new Lottery().getRandomBall(),new Lottery().getRandomBall()};
        for (Ball ball : balls) {
            System.out.println(ball.toString());
        }
    }
}
