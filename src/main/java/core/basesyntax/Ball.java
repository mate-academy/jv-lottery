package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public String getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }

    public String setColor(String color) {
        this.color = color;
        return color;
    }

    public int setNumber(int number) {
        this.number = number;
        return number;
    }

    @Override
    public String toString() {
        return "Ball{"
                + "color='" + color + '\''
                + ", number=" + number
                + '}';
    }
}
