package core.basesyntax.classes;

public class Ball {
    private Color color;
    private int number;

    Ball(Color color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return null;
    }

    public Color getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }

    public String getBallInfo() {
        return String.format("Ball of %s color, with number %d", this.color, this.number);
    }
}
