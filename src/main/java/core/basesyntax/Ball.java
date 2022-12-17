package core.basesyntax;

public class Ball {
    private ColorDiff color;

    private Integer number;

    public void setColor(ColorDiff color) {
        this.color = color;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "number = " + number.toString() + " color = " + color;
    }
}
