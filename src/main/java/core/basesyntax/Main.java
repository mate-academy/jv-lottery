package core.basesyntax;

public class Main {
    private static final int NUMBER_OF_BALLS = 3;
    public static void main (String[] args) {

        Ball[] balls = new Ball[NUMBER_OF_BALLS];
        Lottery lottery = new Lottery();
        for (int i = 0; i < balls.length; i++) {
            balls[i] = new Ball();
            balls[i] = lottery.getRandomBall();
            System.out.println(balls[i]);
        }
    }
}
