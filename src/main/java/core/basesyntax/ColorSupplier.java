package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    protected String [] color = new String[]{
            "red",
            "blue",
            "black",
            "orange",
            "yellow",
            "green",
            "brown",
            "pink"};

    public String getRandomColor() {
        Random random = new Random();
        int i = random.nextInt(color.length);
        return (color[i]);
    }
}
