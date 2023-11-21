package core.basesyntax;

public class Ball {
    private Colors color;
    private int number;

    public Ball(Colors color, int number) {
        this.color = color;
        this.number = number;
    }

    public Colors getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{"
                + "color='" + color.toString().toLowerCase() + '\''
                + ", number=" + number
                + '}';
    }

}
