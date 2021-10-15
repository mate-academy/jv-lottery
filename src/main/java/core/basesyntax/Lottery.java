package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int UNIT = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int ballNumber = random.nextInt(UNIT);
        String colors = colorSupplier.getRandomColor();
        return new Ball(ballNumber, colors);
        //System.out.println("The ball number is:" + ballNumber + "and color is" + color);
    }
}
