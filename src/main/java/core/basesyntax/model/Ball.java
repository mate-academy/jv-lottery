package core.basesyntax.model;

import core.basesyntax.ColorSupplier;

public class Ball extends ColorSupplier {

    private static Integer COUNT;
    private String color;
    private Integer number;

    public Ball(Integer number) {
        this.color = getRandomColor();
        this.number = number;
        if (COUNT == null) {
            COUNT = 0;
        }
        COUNT++;
    }

    @Override
    public String toString() {
        return COUNT + ". Ball {"
                + color + '\''
                + ", " + number
                + '}';
    }
}
