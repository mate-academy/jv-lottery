package core.basesyntax;

class Ball {
    private Lottery lottery = new Lottery();
    private int number = 0;
    private Color color;

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Ball " + getNumber() + " color " + getColor();
    }
}
