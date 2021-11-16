package core.basesyntax;
import java.util.Random;

public class Ball {
    public String color;
    public int number;

    @Override
    public String toString() {
        return "Ball{"
                + "color='" + color + '\''
                + ", number=" + number
                + '}';
    }
}
