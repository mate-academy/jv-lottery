package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public Ball() {
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ball: color = " + this.color + ", number = " + this.number;
    }
}
