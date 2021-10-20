package core.basesyntax;

public class Ball {
    private Color color;
    private int number;

    public Ball(int number, Color color) {
        this.number = number;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Create ball with " + number + " number and " + color + " color";
    }
}
