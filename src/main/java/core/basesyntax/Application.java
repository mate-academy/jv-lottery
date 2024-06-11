package core.basesyntax;

import java.util.List;

public class Application {
    private static final int NUMBER_OF_BALLS = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        List<Ball> balls = lottery.generateBalls(NUMBER_OF_BALLS);

        for (Ball ball : balls) {
            System.out.println(ball);
        }
    }
}
