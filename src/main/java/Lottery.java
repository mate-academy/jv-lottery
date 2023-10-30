import core.basesyntax.Color;
import java.util.Random;

public class Lottery {
    ColorSupplier colorSupplier;
    Random random;
    private static final int AMOUNT = 100;
    public Lottery() {
        this.colorSupplier = new ColorSupplier();
        this.random = new Random();
    }

    public  Ball getRandomBall() {
        Color randomColor = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(AMOUNT);
        return new Ball(randomNumber, randomColor);
    }
}
