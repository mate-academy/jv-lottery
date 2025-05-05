package core.basesyntax;

import java.util.Random;

public class ColorSupplier {    
    private Random random = new Random();
    private Color[] color = Color.values();

    public String getRandomColor() {   
        return color[random.nextInt(color.length)].name(); 
    }
}
