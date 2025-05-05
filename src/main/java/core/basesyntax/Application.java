package core.basesyntax;

import core.basesyntax.classes.Lottery;

public class Application {
    public static void main(String[] args) {
        final int NUMBER_OF_BALLS = 3;
        Lottery lottery = new Lottery();
        for (int order = 0; order < NUMBER_OF_BALLS; order++) {
            System.out.println(lottery.getRandomBall().getBallInfo());
        }
    }
}
