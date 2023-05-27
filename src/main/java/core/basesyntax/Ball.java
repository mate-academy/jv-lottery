package core.basesyntax;


import java.util.Random;

public class Ball extends ColorSupplier {
    private String color = getRandomColor();
    private int number = new Random().nextInt(100);


    @Override
    public String toString() {
        return "color: " + this.color + " number: " + this.number;
    }
}
