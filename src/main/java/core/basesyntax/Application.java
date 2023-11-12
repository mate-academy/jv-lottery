package core.basesyntax;

public class Application {
    private static final int amountOfBalls = 3;
    private static final Lottery lottery = new Lottery();

    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Ball[] balls = new Ball[amountOfBalls];

        for (int i = 0; i < balls.length; i++) {
            balls[i] = lottery.getRandomBall();
            System.out.println(balls[i].name());
        }
    }
}
