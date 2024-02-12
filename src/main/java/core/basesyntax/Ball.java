package core.basesyntax;

class Ball {
    private Color color;
    private int number;

    public Ball(Color color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball has "
                +
                color
                + " color and its number is "
                + number;
    }
}
