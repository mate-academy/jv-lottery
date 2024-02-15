package core.basesyntax;

import java.util.ArrayList;
import java.util.List;

public class Application {
    private static final int NUMBER_OF_BALLS = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        System.out.println(lottery.getRandomBall());
    }
}
