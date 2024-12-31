package core.basesyntax;

public class Ball {
    private Colors color;
    private int number;

    public void setColor(Colors color) {
        this.color = color;
    }

    public String getColor() {
        return this.color.toString();
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    @Override
    public String toString() {
        return "Ball [Color = " + color + ", Number = " + number + "]";
    }
}
