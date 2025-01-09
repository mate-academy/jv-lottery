package core.basesyntax;

import core.basesyntax.classes.Lottery;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int order = 0; order < 3; order++) {
            System.out.println(lottery.getRandomBall().getBallInfo());
        }
    }
}
