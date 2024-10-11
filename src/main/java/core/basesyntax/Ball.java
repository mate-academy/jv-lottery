package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public String getColor() {
        return color;
    }

    public void SetColor(String color) {
        this.color = color;
    }
    public int getNumber() {
        return number;
    }

    public void SetNumber(int number) {
        this.number = number;
    }
    @Override
    public String toString() {
        return "Ball " + color + " " + number;
    }
}