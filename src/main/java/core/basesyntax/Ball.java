package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public String toString() {
        return "Ball number: " + getNumber() + "\nBall color: " + getColor();
    }

    public void setBall(int number, String color) {
        this.color = color;
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }
}
