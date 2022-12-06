package core.basesyntax;

public class Ball {
    private int number;
    private String color;

    Ball(){
    }

    public Ball(int number, String color) {
        this.color = color;
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{"
                + "color="
                + color + ", number="
                + number + '}';
    }
}
