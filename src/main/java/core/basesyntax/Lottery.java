package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        String randomColor = colorSupplier.getRandomColor().name();
        int randomNumber = random.nextInt(101); // Генерує число від 0 до 100 включно
        return new Ball(randomColor, randomNumber);
    }
}
