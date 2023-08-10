package core.basesyntax;

import java.util.Random;

public class Application {
    private static final int BALL_COUNT = 3;
    private static Lottery lottery = new Lottery();

    public static void main(String[] args) {
        for(int i = 0; i < BALL_COUNT; i++) {
            System.out.println(lottery.getRandomBall().toString());
        }
    }
}
