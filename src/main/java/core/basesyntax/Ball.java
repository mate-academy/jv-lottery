package core.basesyntax;

public class Ball {
    private Colors colors;
    private int number;

    public Ball(Colors colors, int number) {
        this.colors = colors;
        this.number = number;
    }

    public Colors getColors() {
        return colors;
    }

    public void setColors(Colors colors) {
        this.colors = colors;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    enum Colors {
        RED, ORANGE, YELLOW,
        GREEN, BLUE, VIOLET
    }

    @Override
    public String toString() {
        return new StringBuilder("color: ").append(colors.name()).append(" & number: ")
        .append(number).append(" ").toString();
    }
}
