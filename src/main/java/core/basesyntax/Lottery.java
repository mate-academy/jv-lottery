package core.basesyntax;

import java.util.Random;

import static core.basesyntax.ColorSupplier.getRandomColor;

public class Lottery {
    public static Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(getRandomColor());
        Random random = new Random();
        int index = random.nextInt(100);
        ball.setNumber(index);
        return ball;
    }
}
