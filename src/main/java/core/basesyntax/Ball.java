package core.basesyntax;

public class Ball {
    String color;
    int number;

    @Override
    public String toString() {
        return "Ball - Color: " + color + ". Number: " + number;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
