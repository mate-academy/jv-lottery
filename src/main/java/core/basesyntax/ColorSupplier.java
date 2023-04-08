package core.basesyntax;
import java.util.Random;
import java.lang.String;
public class ColorSupplier {
    public final Random randomColor = new Random();
    public String getRandomColor() {
        return ColorEnum.values()[randomColor.nextInt(ColorEnum.values().length)].name();
    }
}