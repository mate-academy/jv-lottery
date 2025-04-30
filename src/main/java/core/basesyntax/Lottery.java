package core.basesyntax;

import java.util.Random;

public class Lottery {

    public Ball getRandomBall() {

        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();

        String randomColor = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(101);

        Ball ball = new Ball(randomColor, randomNumber);

        return ball;
    }
}
