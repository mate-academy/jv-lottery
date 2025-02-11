package core.basesyntax;
import java.awt.*;

public class Ball {
    private final int number;
    private final String color;

    public Ball() {
        this.number = (int) (Math.random() * 100) + 1;
        this.color = ColorSupplier.getRandomColor();
    }

    @Override
    public String toString() {
        return this.number + " " + this.color;
    }
}
