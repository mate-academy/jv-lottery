package core.basesyntax;

public class Ball {
    private Color color;
    private int number;

    public void setColor(Color color) {
        this.color = color;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String toString() {
        return "A " + color.name() + " ball number " + number;
    }
}
