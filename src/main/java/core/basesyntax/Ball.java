package core.basesyntax;

public class Ball {

    private String Colour;
    private int number;

public Ball(String color, int number) {

    this.Colour = color;
    this.number = number;
}
@Override
public String toString() {

    return "Ball{color = '" + Colour + "', number = " + number + "}";
}
}

