package core.basesyntax;

/**
 * Created by SpecVova on 29.06.2023.
 */
public class Ball {
    private final String color;
    private final int number;

    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball:  "
                + "color='" + color + '\''
                + ", number=" + number
                + "\n";
    }
}
