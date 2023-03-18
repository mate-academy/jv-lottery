package core.basesyntax;

public class Application {
    private static final int NUMBER_OF_USERS = 3;

    public static void main(String[] args) {
        Ball[] ball = new Ball[NUMBER_OF_USERS];
        for (int i = 0; i < ball.length; i++) {
            ball[i] = new Lottery().getRandomBall();
            System.out.println(ball[i]);
        }
    }
}
