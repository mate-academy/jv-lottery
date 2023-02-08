package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAGIC_NUMBER = 100;
    private ColorSupplier colorSupplier;
        
    public Lottery() {
        colorSupplier = new ColorSupplier();
    }
     
    public Ball getRandomBall() {
        return new Ball(generateNumber() + 1, colorSupplier.getRandomColor());
    }
        
    private int generateNumber() {
        Random random = new Random();
        return random.nextInt(MAGIC_NUMBER);
    }
}
