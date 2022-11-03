package core.basesyntax;

public class Ball {
    private int number;
    private String color;

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

    public Ball(int numberBall, String colorBall) {
        number = numberBall;
        color = colorBall;
    }

    @Override
    public String toString() {
        return "number " + number + " " + "color " + color;
    }
}
