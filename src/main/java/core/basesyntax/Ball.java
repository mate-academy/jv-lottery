package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Your random ball:"
                + System.lineSeparator()
                + "humber - "
                + number
                + System.lineSeparator()
                + "color - "
                + color
                + System.lineSeparator();
    }
}
