package core.basesyntax;

import java.util.Random;

public class Lottery {
    public String getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String newColor = colorSupplier.getRandomColor();

        Random random = new Random();
        int newNumber = random.nextInt(100);

        Ball ball = new Ball(newColor, newNumber);

        return ball.toString();
    }
}
