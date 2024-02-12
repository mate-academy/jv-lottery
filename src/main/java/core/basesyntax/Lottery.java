package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int AMOUNT_OF_BALL = 99;

    ColorSupplier colorSuplier = new ColorSupplier();
    Random random = new Random();
    
    public Ball getRandomBall() {
        return new Ball(colorSuplier.getRandomColor(), random.nextInt(AMOUNT_OF_BALL));
    }
}
