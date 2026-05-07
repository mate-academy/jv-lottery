package core.basesyntax;

public class Ball {
    private Color color;
    private int number;

    public void setRandomColor(Color color) {
        this.color = color;
    }

    public void setRandomNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Color is" + " " + color.name() + " " + "number is " + number;
    }
}





