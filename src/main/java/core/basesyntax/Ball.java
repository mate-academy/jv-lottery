package core.basesyntax;
public class Ball extends Application{
    private String color;
    private int number;
    public Ball (ColorsEnum color, int number) {
        this.color = String.valueOf(color);
        this.number = number;
    }
    @Override
    public String toString() {
        return " is " + color + " and has number " + number;
    }
}

