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
    public String toString() {
        return "The winning ball has " + color + " color and lucky number is " + number;
    }

}
