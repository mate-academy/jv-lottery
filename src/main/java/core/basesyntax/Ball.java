package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumber(int num) {
        this.number = num;
    }

    @Override
    public String toString() {
        return "color: " + this.color + ", number: " + this.number;
    }
}
