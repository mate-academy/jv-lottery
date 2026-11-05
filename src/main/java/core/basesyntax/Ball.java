package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Color of the ball: " + color
                + " Number of the ball:" + number;
    }

}
