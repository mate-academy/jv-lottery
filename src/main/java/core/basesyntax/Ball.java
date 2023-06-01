package core.basesyntax;

class Ball {
    private int number;
    private Color color;

    Ball(int number, Color color) {
        this.number = number;
        this.color = color;
    }

    int getNumber() {
        return number;
    }

    void setNumber(int number) {
        this.number = number;
    }

    Color getColor() {
        return color;
    }

    void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ball{"
                + "number=" + number
                + ", color=" + color
                + '}';
    }

}
