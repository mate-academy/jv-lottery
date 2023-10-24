package core.basesyntax;

public class Application {
    private static final int NUMBER_OF_USERS = 3;
    private static final Lottery lottery = new Lottery();

    public static void main(String[] args) {
        Ball[] balls = new Ball[NUMBER_OF_USERS];
        for (int i = 0; i < NUMBER_OF_USERS; i++) {
            balls[i] = lottery.getRandomBall();
            System.out.println(balls[i].toString());
        }
    }
}
