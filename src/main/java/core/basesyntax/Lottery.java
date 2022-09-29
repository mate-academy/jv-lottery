package core.basesyntax;

import java.util.Random;

public class Lottery extends Ball {
    private static final int FIGURE_COUNT = 100;
    private Random random = new Random();

    public String GetRandomBall(){
        Ball ball = new Ball();
        int number = random.nextInt(FIGURE_COUNT);
        String ball2 = String.valueOf(ball.getRandomColor());
        return  ball2 + number;
    }
}
