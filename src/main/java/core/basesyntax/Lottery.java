package core.basesyntax;
import java.util.Random;
class Lottery {
    public static Ball getRandomBall() {
        String color = ColorSupplier.getRandomColor();
        int number = new Random().nextInt(100) + 1; // Generates number between 1 and 100
        return new Ball(color, number);
    }
}
