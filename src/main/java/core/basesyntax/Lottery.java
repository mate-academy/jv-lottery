package core.basesyntax;

//import java.awt.*;
import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        String randomColor = ColorSupplier.getRandomColor();
        int randomNumber = new Random().nextInt(100) + 1;
        return new Ball(randomColor, randomNumber);
    }
}
