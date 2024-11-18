package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier colorSupplier = new ColorSupplier(); // Один екземпляр ColorSupplier

    public Ball getRandomBall() {
        String randomColor = colorSupplier.getRandomColor(); // Отримуємо випадковий колір
        int randomNumber = new Random().nextInt(101); // Генеруємо випадкове число (0-100)
        return new Ball(randomColor, randomNumber); // Створюємо та повертаємо об'єкт Ball
    }
}
