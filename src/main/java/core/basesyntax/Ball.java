package core.basesyntax;

public class Ball {
    String color;
    int number;

    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    public Ball(String color) {
        this.color = color;
    }
    
    public String getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Ball - number = " + number + ", color = " + color;
    }

}
