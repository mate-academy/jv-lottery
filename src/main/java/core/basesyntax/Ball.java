package core.basesyntax;

public class Ball {
    private Color color;
    private Integer number;

    public Ball(Color color, Integer number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return this.color.toString() + this.number.toString();
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
