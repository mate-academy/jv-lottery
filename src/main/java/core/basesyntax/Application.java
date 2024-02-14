package core.basesyntax;

import java.util.ArrayList;
import java.util.List;

public class Application {
    private static final int NUMBER_OF_BALLS = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        List<Ball> ballList = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_BALLS; i++) {
            ballList.add(lottery.getRandomBall());
        }
        System.out.println(ballList);
    }
}
