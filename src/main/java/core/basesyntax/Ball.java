package core.basesyntax;

public class Ball {
    private int number;
    private String color;

    public Ball(String color,int number) {
        this.number = number;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ball{"
                + "number=" + number
                + ", color='" + color + '\''
                + '}';
    }
}

