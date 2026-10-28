package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public String getColor() {
        return color;
    }

    public Ball setColor(String color) {
        this.color = color;
        return this;
    }

    public int getNumber() {
        return number;
    }

    public Ball setNumber(int number) {
        this.number = number;
        return this;
    }

    @Override
    public String toString() {
        return "Ball{"
                + "color='" + color + '\''
                + ", number=" + number
                + '}';
    }
}
