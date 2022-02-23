package core.basesyntax;

import java.util.Random;

public class Lottery {
    public String getRandomBall() {
        Random random = new Random();
        int randomNumber = (random.nextInt(100));
        ColorSupplier colorSupplier = new ColorSupplier();
        String randomColor = colorSupplier.getRandomColor();
        Ball ball = new Ball(randomColor, randomNumber);
        return ball.toString();
    }

}
