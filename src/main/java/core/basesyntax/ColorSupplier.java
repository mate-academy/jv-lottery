package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    enum Colors {
        BLUE,
        YELLOW,
        RED,
        GREEN,
        WHITE,
        BLACK,
        SILVER,
        GOLD,
        ORANGE
    }

    private Random generateRandomColor = new Random();

    public String getRandomColor() {
        //create an array with elements from enum Colors
        //Colors[] values = Colors.values();
        //initialization of the length of an array
        //int length = values.length;
        //create a random index from 0 to length of an array
        //int randIndex = new Random().nextInt(length);
        //return values[randIndex].toString();
        int randIndex = generateRandomColor.nextInt(Colors.values().length);
        return Colors.values()[randIndex].name();
    }
}
