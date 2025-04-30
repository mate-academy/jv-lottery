package core.basesyntax;

public class Ball {
    private int number = 0;
    private String color;

    public void setNumber(int number) {
        this.number = number;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ball : "
                + "number = " + number
                + ", color = '" + color + '\'';
    }
}
