package core.basesyntax;

public class Ball {
    private Colors color;
    private int number;

    @Override
    public String toString() {
        return "Get " + color + " ball, with number " + number;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
