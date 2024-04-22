
package core.basesyntax;
import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        return new Ball(color, number);
    }
}
