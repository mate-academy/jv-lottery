package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Random rand = new Random();
        int ballNum = rand.nextInt(100);
        ColorSupplier cs = new ColorSupplier();
        String color = cs.getRandomColor();
        Ball ball = new Ball(color, ballNum);

        return ball;
    }
}
