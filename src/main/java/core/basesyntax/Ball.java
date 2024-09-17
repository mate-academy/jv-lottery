package core.basesyntax;

public class Ball {
    private int number;
    private Colors color;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getColor() {
        return color.name();
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (color == null) {
            return "Ball number: " + number;
        }
        return "Ball number: " + number + ", color: " + color;
    }
}
