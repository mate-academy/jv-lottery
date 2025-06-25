package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier colorSupplier;
    private final Random random = new Random();

    public Lottery() {
        this.colorSupplier = new ColorSupplier();
    }

    // Метод створює кулю з випадковим кольором та числом (від 1 до 100)
    public Ball getRandomBall() {
        Color randomColor = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(100) + 1; // Число від 1 до 100 включно
        return new Ball(randomColor, randomNumber);
    }
}
