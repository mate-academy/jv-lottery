package core.basesyntax;
import java.util.Random;
public class Ball {
    private Color color;
    private int number;

    public Ball() {
        this.color = new ColorSupplier().getRandomColor();
        this.number = new Random().nextInt(100);
    }

    @Override
    public String toString() {
        return ("Color: " + color.name() + " Number: " + number);
    }
}
