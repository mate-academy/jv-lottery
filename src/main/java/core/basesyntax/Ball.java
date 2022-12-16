package core.basesyntax;

public class Ball {
    private int number = 0;
    private String color = new String();

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ball`s color is " + this.color + " and number is " + this.number;
    }
}
