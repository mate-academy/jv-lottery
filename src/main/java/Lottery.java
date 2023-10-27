import core.basesyntax.Color;
import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        Color randomColor = ColorSupplier.getRandomColor();
        int randomNumber = new Random().nextInt(100);

        return new Ball(randomNumber, randomColor);
    }
}
