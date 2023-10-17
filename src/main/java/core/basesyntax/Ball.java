package core.basesyntax;

public class Ball {
    private Colors colors;
    private int number;

    public Ball(Colors colors, int number) {
        this.colors = colors;
        this.number = number;
    }

    public Colors getColors() {
        return colors;
    }

    public void setColors(Colors colors) {
        this.colors = colors;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{"
                + "colors=" + colors
                + ", number=" + number
                + '}';
    }
}





