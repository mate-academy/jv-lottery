package core.basesyntax;

public class Ball {
    private final Colors colors;
    private int number;

    public Ball(Colors color, int number) {
        this.colors = color;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{"
                + "color='"
                + colors + '\''
                + ", number=" + number + '}';
    }
}
