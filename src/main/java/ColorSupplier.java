import java.util.Random;
public class ColorSupplier {
    private static final Random RANDOM = new Random();
    public static Color getRandomColor(){
        Color[] someColor = Color.values();
        int index =  RANDOM.nextInt(Color.values().length);
        return Color.values()[index];
    }
}
