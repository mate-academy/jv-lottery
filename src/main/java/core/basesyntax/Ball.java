package core.basesyntax;

public class Ball {
    private Color color;
    private int number;
    public void setColor(Color newColor) {
        this.color = newColor;
    }

    public void setNumber(int newNumber) {
        this.number = newNumber;
    }

    @Override
    public String toString() {
        return this.number + " " + this.color;
    }
}
