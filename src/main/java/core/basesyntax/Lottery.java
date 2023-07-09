package core.basesyntax;

//import java.awt.*;
import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();
    public Ball getRandomBall() {
        int randomNumber = new Random().nextInt(100) + 1;
        return new Ball(colorSupplier.getRandomColor(), randomNumber);
    }
}
