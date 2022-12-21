package core.basesyntax;

public class Ball {
    private Color color;

    private Integer number;

    public void setColor(Color color) {
        this.color = color;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{" + "color='" + color + '\'' + ", number=" + number + '}';
    }
}
