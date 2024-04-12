package core.basesyntax;

import java.util.Random;

public class Ball extends ColorSupplier {
    private String color;
    private int number;

    public Ball() {
        this.number = new Random().nextInt(101);
        this.color = super.getRandomColor();
    }

    public String getBall() {
        StringBuilder builder = new StringBuilder();
        builder.append(number);
        String out = color + " " + builder.toString();
        return out;
    }
}
