package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier colorSupplier;
    Random random = new Random();

    public Lottery() {
        this.colorSupplier = new ColorSupplier();
    }

    public Ball getRandomBall() {
        Color randomColor = colorSupplier.getRandomColor();
        int minNumber = 1;
        int maxNumber = 100;
        int randomNumber = minNumber + new Random().nextInt(maxNumber - minNumber + 1);
        return new Ball(randomColor, randomNumber);
    }
}
