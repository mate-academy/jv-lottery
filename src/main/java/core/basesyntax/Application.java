package core.basesyntax;

public class Application {
    private static final int NUMBER_OF_USERS = 3;

    public static void main(String[] args) {
        Ball[] balls = new Ball[NUMBER_OF_USERS];
        Lottery lottery = new Lottery();

        for (int i = 0; i < balls.length; i++) {
            balls[i] = lottery.getRandomBall();
            System.out.println("The ball " + (i + 1) + " " + balls[i]);
        }
    }
}
