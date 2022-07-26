package core.basesyntax;

public class Ball {
    private int numder;
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumder(int numder) {
        this.numder = numder;
    }

    @Override
    public String toString() {
        return "Ball{"
                + "color='" + color + '\''
                + ", numder=" + numder
                + '}';
    }
}
