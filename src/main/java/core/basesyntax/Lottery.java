package core.basesyntax;

//import java.awt.*;
import java.util.Random;

public class Lottery extends ColorSupplier {
    public static Ball getRandomBall() {
        Random ran = new Random();
        int number = ran.nextInt(100);
        Colors color = getRandomColor();
        return new Ball(color,number);
    }
}
