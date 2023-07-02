package core.basesyntax;

//import java.awt.*;
import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        //String randomColor = ColorSupplier.getRandomColor();
        ColorSupplier colorSupplier = new ColorSupplier();
        int randomNumber = new Random().nextInt(100) + 1;
        return new Ball(colorSupplier.getRandomColor(), randomNumber);
    }
}
