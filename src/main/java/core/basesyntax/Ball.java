package core.basesyntax;

public class Ball {
    private Color color;
    private int number;

    public Ball() {

    }

    public Ball(Color color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "color: " + color + "\n"
                + "number: " + number + "\n";
    }
}
