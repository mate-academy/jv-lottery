package core.basesyntax;

public class Ball {
    private int value;
    private String color;

    public void setValue(int value) {
        this.value = value;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getValue() {
        return value;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Ball{"
                +
                "value=" + value
                +
                ", color='" + color + '\''
                +
                '}';
    }
}
