package core.basesyntax;

public class Ball {
    int number;
    String color;

    public Ball(int number, String color) {
        this.number = number;
        this.color = color;
    }

    public String toString(){
        return "Color is " + color + ", number is " + number;
    }

}
