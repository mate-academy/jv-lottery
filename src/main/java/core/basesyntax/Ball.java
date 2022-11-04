package core.basesyntax;

import lombok.Data;

@Data
public class Ball {
    private final String color;

    private final int number;

    @Override
    public String toString() {
        return "Ball ["
                + "color: " + color
                + ", number: " + number + ']';
    }
}
