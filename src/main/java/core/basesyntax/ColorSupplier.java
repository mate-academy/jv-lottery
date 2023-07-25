package core.basesyntax;
import java.util.Random;
public class ColorSupplier {
    public ColorsEnum getRandomColor() {
        Random random = new Random();
        int index = random.nextInt(ColorsEnum.values().length);
        ColorsEnum color = ColorsEnum.values()[index];
        return color;
    }
}
