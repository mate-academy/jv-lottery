package core.basesyntax;

public class Ball {
    private Color color;
    private Integer number;

    public Ball(Color color, Integer number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Color: " + color + "\nNumber: " + number;
    }
}
