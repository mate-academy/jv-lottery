package core.basesyntax;

public class Application {
    private static final int BALLS_NUMBER = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball[] ball = new Ball[BALLS_NUMBER];
        for (int i = 0; i < ball.length; i++) {
            ball[i] = lottery.getRandomBall();
            System.out.println(ball[i]);
        }
    }
}
