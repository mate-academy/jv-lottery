package core.basesyntax;

public class Ball {

    private int number;
    private String color;

    public Ball(String colorBall, int numberBall) {
        this.color = colorBall;
        this.number = numberBall;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Color: " + color + " and Number: " + number;
    }
}
