package core.basesyntax;

public class Ball {
    private int number;
    private Color color;

    public void setNumber(int number) {
        this.number = number;
    }

    public void setColor(Color color) {

        this.color = color;
    }

    @Override
    public String toString() {
        return "Ball{"
                + "number=" + number
                + ", color=" + color
                + '}';
    }
}
