package core.basesyntax;

public class Ball {
    private Color color;
    private int number;

    public Color getColor() { return  color; }
    public void setColor(Color color) { this.color = color; }

    public int getNumber() { return  number; }
    public void setNumber() { this.number = number; }

    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                ", number=" + number +
                '}';
    }

    public Ball() {
        this(null, 0);
    }

    public Ball(Color color, int number) {
        this.color = color;
        this.number = number;
    }
}
