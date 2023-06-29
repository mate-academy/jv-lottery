package core.basesyntax;

public class Ball {
    private final Colors COLORS;
    private int number;

    public Ball(Colors color, int number) {
        this.COLORS = color;
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
                + COLORS + '\''
                + ", number=" + number + '}';
    }
}
