package core.basesyntax;

import java.util.Random;

public class Application {
    public static final int BALLS_NUMBER = 3;
    public static final int MAX_NUMBER_OF_BALL = 100;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 0; i < BALLS_NUMBER; i++) {
            System.out.println(lottery.getRandomBall().getToString());
        }
    }
}


