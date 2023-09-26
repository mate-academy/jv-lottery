package core.basesyntax;

public class Application {
    static final int COUNT_OF_BALLS = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();

        Ball[] balls = new Ball[COUNT_OF_BALLS];
        for (int i = 0; i < COUNT_OF_BALLS; i++) {
            balls[i] = lottery.getRandomBall();
            System.out.println(balls[i]);
        }
    }
}
