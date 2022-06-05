package core.basesyntax;

public class Ball extends ColorSupplier {
    public String color;
    public int number;

    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                ", number=" + number +
                '}';
    }
}

