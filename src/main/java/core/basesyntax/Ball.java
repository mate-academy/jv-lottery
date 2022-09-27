package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    @Override
    public String toString() {
        return "Color is: " + color + "\n" + "Number is: " + number;
    }
}
