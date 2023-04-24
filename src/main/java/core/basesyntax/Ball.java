package core.basesyntax;

import java.util.Random;

public class Ball {
    String color = ColorSupplier.getRandomColor().toString();
    Random numberRandom = new Random();
    int number = numberRandom.nextInt(100);

    public String toString () {
       return color + " " + number;
    }
}
