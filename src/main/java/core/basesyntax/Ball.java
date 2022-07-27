package core.basesyntax;

public class Ball {
    private int number;
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumder(int numder) {
        this.number = numder;
    }

    @Override
    public String toString() {
        return "Ball{"
                + "color='" + color + '\''
                + ", numder=" + number
                + '}';
    }
}
