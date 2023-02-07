package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private String [] colors = new String[]{"red","green","blue","yellow","pink","black",
            "white","brown","gray","orange"};

    public String getRandomColor() {
        Random random = new Random();
        return colors[random.nextInt(colors.length - 1)];
    }
}
