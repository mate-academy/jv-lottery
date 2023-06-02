package core.basesyntax;

public class Ball {
    private Color color;
    private int number;
    @Override
    public String toString() {
        return "Color: " + color + "; number: " + number;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }




}
