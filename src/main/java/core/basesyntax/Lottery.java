package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();
    ColorSupplier colorSupplier = new ColorSupplier();
    
    public Ball getRandomBall() {
        int maxNumber = 100;
        int minNumber = 1;
        Color randomColor = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(maxNumber - minNumber + 1) + minNumber;
        return new Ball(randomColor.name(), randomNumber);
    }
}
