package core.basesyntax;
import java.util.Random;

public class Ball {
    public String color;
    public int number;

    @Override
    public String toString() {
        color = new ColorSupplier().getRandomColor().toString();
        number = new Random().nextInt(100);
        return "Ball{"
                + "color='" + color + '\''
                + ", number=" + number
                + '}';
    }
}
