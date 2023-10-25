package core.basesyntax;

import core.basesyntax.objects.Color;

import java.util.Random;

public class ColorSupplier {
    private Random random;
    public ColorSupplier() {
        // SHOULD I CREATE RANDOM OBJECT AS FIELD FOR ALL CLASS,
        // OR IT IS BETTER TO LEAVE IT AS VARIABLE IN METHOD getRandomColor ?
        this.random = new Random();
    }
    public String getRandomColor() {
        int r = random.nextInt(Color.values().length);
        Color color = Color.values()[r];
        return color.name();
    }
}
