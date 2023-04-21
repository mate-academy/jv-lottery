package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public Ball(core.basesyntax.Colors color, int number) {
        this.color = String.valueOf(color);
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String toString() {
        return "Ball: "
                + "color = "
                + color
                + ", number = " + number;
    }
}
