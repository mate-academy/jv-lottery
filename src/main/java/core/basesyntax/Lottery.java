package core.basesyntax;
import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        ColorSupplier supplier = new ColorSupplier();
        Random rand = new Random();
        String color = supplier.getRandomColor();
        int number = rand.nextInt(101);
        return new Ball(color, number);
    }
}
