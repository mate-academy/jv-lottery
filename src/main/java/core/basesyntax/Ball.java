package core.basesyntax;

public class Ball {
    private ColorOfBall color;
    private int number;

    public ColorOfBall getColor() {
        return color;
    }

    public void setColor(ColorOfBall color) {
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball number - " + number + ";" + " " + "color - " + color;
    }
}
