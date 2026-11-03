package core.basesyntax;

public class Ball {
    private Colors color;
    private int number;

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public Colors getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Color of the ball: " + color
                + " Number of the ball:" + number;
    }

}
