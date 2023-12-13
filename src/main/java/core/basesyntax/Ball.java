package core.basesyntax;

import java.awt.*;

public class Ball {

    String color ;
    int number ;
    public Ball() {

    };

    public Ball(int number, String color) {
        this.number = number;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color=" + color +
                ", number=" + number +
                '}';
    }
}
