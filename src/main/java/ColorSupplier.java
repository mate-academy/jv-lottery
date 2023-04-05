import java.util.Random;
public class ColorSupplier {
    private static final Random random = new Random();

    public static Color getRandomColor(){
        Color[] someColor = Color.values();
        int index =  random.nextInt(Color.values().length);
        return Color.values()[index];
    }
}
