package core.basesyntax;

public class Ball {

    private Colors color;
    private int number;

    public Ball(Colors color) {
        this.color = color;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return " {"
                + "color = "
                + color
                + ", number = "
                + number
                + '}';
    }
}
