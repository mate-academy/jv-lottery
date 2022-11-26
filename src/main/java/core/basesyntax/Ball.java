package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    @Override
    public String toString() {
        return "Ball color: " + color + ", ball number: " + number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
