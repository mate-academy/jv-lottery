package core.basesyntax;

public class Ball extends ColorSupplier {
    int number;
    String color;

    public Ball(String color,int number) {
        this.number = number;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "number=" + number +
                ", color='" + color + '\'' +
                '}';
    }
}
