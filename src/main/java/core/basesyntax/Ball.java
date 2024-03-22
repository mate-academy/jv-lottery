package core.basesyntax;

public class Ball extends Lottery {

    private String color;
    private int number;

    public int getNumber() {
        return number;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Random color is: " + color + "\n" + "Random number is: " + number;
    }
}
