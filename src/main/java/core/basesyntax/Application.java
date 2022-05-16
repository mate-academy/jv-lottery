package core.basesyntax;

public class Application {
    private static final int BALLS_NUMBER = 3;

    public static void main(String[] args) {
        Ball ball1 = new Ball().getRandomBall();
        Ball ball2 = new Ball().getRandomBall();
        Ball ball3 = new Ball().getRandomBall();
        Ball[] ballsArray = {ball1, ball2, ball3};
        for (int i = 0; i < BALLS_NUMBER; i++) {
            System.out.println(ballsArray[i].toString());
        }
    }
}
