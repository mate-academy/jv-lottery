package core.basesyntax;

public class Ball {
    final private int number;
    final private Color color;

    public Ball(int number, Color color) {
        this.number = number;
        this.color = color;
    }

    public String toString(){
       return "Color: " + color + " Number: " + number;
    }
}
