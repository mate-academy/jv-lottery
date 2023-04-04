import java.util.Random;
public class ColorsSupplier {
    private static final Random RANDOM = new Random();
    public static Colors getRandomColor(){
        Colors[] someColor = Colors.values();
        int index = new Random().nextInt(Colors.values().length);
        return Colors.values()[index];
    }
}
