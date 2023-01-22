package core.basesyntax;

public class Ball {
    private Colors color;
    private final int number;

    public Ball(Colors color, int number) {
        this.color = color;
        this.number = number;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public Colors getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Ball color= " + color.name() + ", number= " + number;
    }
}
