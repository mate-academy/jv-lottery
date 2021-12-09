package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(100));
    }
}

/*Затем создайте класс Lottery с методом getRandomBall (), который вернет мяч. Этот метод должен
создать шар случайного цвета и случайного числа (максимально возможное число должно быть 100)
и вернуть этот шар из метода.
 */
