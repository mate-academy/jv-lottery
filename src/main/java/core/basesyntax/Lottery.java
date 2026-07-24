package core.basesyntax;

import java.util.Random;

public class Lottery {
    public String getRandomBall() {
        Random rand = new Random();
        int random = rand.nextInt(100);

        Ball ball = new Ball();
        ball.setNumber(random);

        ColorSupplier colorSupplier = new ColorSupplier();
        String supply = colorSupplier.getRandomColor();
        ball.setColor(supply);

        return ball.toString();
    }
}
