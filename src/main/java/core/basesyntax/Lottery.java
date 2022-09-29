package core.basesyntax;

import java.util.Random;

public class Lottery extends Ball {
    private static final int FIGURE_COUNT = 100;
    private Random random = new Random();

    public String getRandomBall() {
        Ball ball = new Ball();
        int number = random.nextInt(FIGURE_COUNT);
        String color = String.valueOf(ball.getRandomColor());
        return color + number;
    }
}
