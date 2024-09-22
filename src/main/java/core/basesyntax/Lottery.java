package core.basesyntax;

import java.util.Random;

public class Lottery {
    public  Random random = new Random();
    public ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        String randomColor = colorSupplier.getRandomColor();  // отримуємо випадковий колір
        int randomNumber = random.nextInt(101);  // випадкове число від 0 до 100 включно
        return new Ball(randomColor, randomNumber);
    }
}
