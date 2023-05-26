package core.basesyntax;

import java.util.Locale;

public class Ball {
    private String color;
    private int number;

    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "New ball is [ " + number + " " + color.toLowerCase(Locale.ROOT) + " ];";
    }
}
