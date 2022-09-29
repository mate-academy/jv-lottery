package core.basesyntax;

public class Ball {
    private Color color;
    private int number;

    @Override
    public String toString() {
        return color + " Ball " + "with number " + number;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
