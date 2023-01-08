package core.basesyntax;

import java.util.Random;

public class Ball {
    private String color;
    private int number;

    public void setColor() {
        ColorSupplier colorSupplier = new ColorSupplier();
        this.color = colorSupplier.getRandomColor();
    }

    public void setNumber(int num) {
        Random random = new Random();
        this.number = random.nextInt(num);
    }

    @Override
    public String toString() {
        return  "color: "
                + this.color
                + ", number: "
                + this.number;
    }
}
