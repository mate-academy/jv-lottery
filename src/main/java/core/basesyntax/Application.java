package core.basesyntax;

public class Application {
    private static final int MAX_BALL_NUMBER = 3;

    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Ball[] balls = new Ball[MAX_BALL_NUMBER];
        Lottery lottery = new Lottery();
        for (int i = 0; i < balls.length; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
