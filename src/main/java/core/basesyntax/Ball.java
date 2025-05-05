package core.basesyntax;

public class Ball {
    private Color color;
    private int number;

    public void setColor(String color) {
        this.color = Color.valueOf(color);
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball's number: " + number
                + "\nIt's color: " + color;
    }
}
