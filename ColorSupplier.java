import java.util.Random;

public class ColorSupplier {
    public Color getRandomColor(int index) {
       index = new Random().nextInt(Color.values().length);
       return Color.values()[index];
    }
}