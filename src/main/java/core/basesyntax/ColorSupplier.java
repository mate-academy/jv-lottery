package core.basesyntax;
import java.util.Random;
public class ColorSupplier {
    private Random rmd = new Random();

    public String getRandomColor() {
        int i = rmd.nextInt(Color.values().length);
        return Color.values()[i].name(); 
    }
}


