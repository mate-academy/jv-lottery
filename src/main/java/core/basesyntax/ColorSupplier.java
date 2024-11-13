package core.basesyntax;

public class ColorSupplier {
    public String getRandomColor() [
        Random rmd = new Random();
        int index = rmd.nextInt(Color.values().length);
        String randomColor = Color.values()[index];
        return randomColor;
    ]
}
/*import java.util.Random;

public class ColorSupplier {
    private Random rmd = new Random();

    public String getRandomColor() {
        int i = rmd.nextInt(Color.values().length);
        return Color.values()[i].name(); 
    }
}*/

