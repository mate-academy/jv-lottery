package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Color newColor = ColorSupplier.getRandomColor();
        String randomColor = newColor.name();
        Random random = new Random();
        int randomNumber = random.nextInt(100);

        Ball ball = new Ball();
        ball.setColor(randomColor);
        ball.setNumber(randomNumber);
        return ball;
    }
}
