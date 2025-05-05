package core.basesyntax;

public class Ball {
    private int number;

    private Colors color;

    public void setColor(Colors color) {
        this.color = color;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{"
                + "color=" + color
                + ", number=" + number
                + '}';
    }
}
