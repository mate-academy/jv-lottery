package core.basesyntax;

public class Application {
    private static final int BALL_COUNT = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 0; i < BALL_COUNT; i++) {
            System.out.println(lottery.getRandomBall());
        }

//        Ball ball1 = lottery.getRandomBall();
//        Ball ball2 = lottery.getRandomBall();
//        Ball ball3 = lottery.getRandomBall();
//
//        System.out.println(ball1);
//        System.out.println(ball2);
//        System.out.println(ball3);
    }
}
