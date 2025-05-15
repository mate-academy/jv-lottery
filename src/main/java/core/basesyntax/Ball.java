package core.basesyntax;

public class Ball {

    private String colour;
    private int number;

public Ball(String color, int number) {
    this.colour = color;
    this.number = number;
}
@Override
public String toString() {
    return "Ball{color = '" + colour + "', number = " + number + "}";

}
}

