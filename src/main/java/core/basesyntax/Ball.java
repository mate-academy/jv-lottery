package core.basesyntax;

public class Ball {
    private int number;
    private String color;

    public Ball(int number, String color) {
        this.number = number;
        this.color = color;
    }

    public int getNumber() {
        return this.number = number;
    }

    public String getColor() {
        return this.color = color;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return this.number + this.color;
    }
}
