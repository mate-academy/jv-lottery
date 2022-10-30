package core.basesyntax;

public class Ball {
    private Colors color;
    private int number;

    public void setColor(Colors colors) {
        this.color = colors;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return color + ", " + number;
    }
}
