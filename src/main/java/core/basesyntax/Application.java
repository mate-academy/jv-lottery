package core.basesyntax;

import java.util.List;

public class Application {
    private static final int NUMBER_OF_BALLS = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();

        for (int i = 0; i < NUMBER_OF_BALLS; i++) {
            Ball ball = lottery.getRandomBall();
            System.out.println(ball);
        }
    }
}
// Я не розумію ваших зауважень, в мене код працює я вже тиждень граюсь з одним завданням.
