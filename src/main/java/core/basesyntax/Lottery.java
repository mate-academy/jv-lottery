package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    
    public Ball getRandomBall() {
        Color randomColor = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(100 - 1 + 1) + 1;
        return new Ball(randomColor.name(), randomNumber);
    }
}
