package core.basesyntax;

public class Ball {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    private int number;

    @Override
    public String toString() {
        return "Ball{"
                + "color='" + color + '\''
                + ", number=" + number
                + '}';
    }
}
