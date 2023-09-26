package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        final int COUNT_OF_BALLS = 3;

        Ball[] balls = new Ball[COUNT_OF_BALLS];
        for (int i = 0; i < COUNT_OF_BALLS; i++) {
            balls[i] = lottery.getRandomBall();
            System.out.println(balls[i]);
        }
    }
}