package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public Ball() {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{color=' " + color + " ', number=" + number + "}";
    }

    public void setColor(Color color) {
        this.color = String.valueOf(color);
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
