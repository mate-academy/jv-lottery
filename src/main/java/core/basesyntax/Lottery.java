package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final Random random = new Random();

    public static final Ball BALL1 = new Ball(ColorSupplier.getRandomColors(),
            +random.nextInt(100) + 1);
    public static final Ball BALL2 = new Ball(ColorSupplier.getRandomColors(),
            +random.nextInt(100) + 1);
    public static final Ball BALL3 = new Ball(ColorSupplier.getRandomColors(),
            +random.nextInt(100) + 1);

    public static Ball getRandomBall() {
        Color.Colors randomColor = ColorSupplier.getRandomColors();
        int randomNumber = random.nextInt(100) + 1;
        return new Ball(randomColor, randomNumber);
    }

}
