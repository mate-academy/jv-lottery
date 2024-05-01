package core.basesyntax;

public class Ball {
    private String color;
    private int number;
    // setter , getter for number

    public void setNumber(int number) {
        this.number = number;
    }
    // setter , getter for color

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "You got from lottery " + color + " ball with number: " + number;
    }
}

