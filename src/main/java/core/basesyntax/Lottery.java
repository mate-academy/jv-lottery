package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final static int MAX_NUMBER = 100;
    private  ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        int randomNumber = random.nextInt(MAX_NUMBER);
        String randomColor = colorSupplier.getRandomColor();
        return new Ball(randomColor,randomNumber);
    }
}
