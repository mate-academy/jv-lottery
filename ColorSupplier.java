import java.util.Random;
public class ColorSupplier {
    public Colors getRandomColor() {
        Random random = new Random();
        Colors[] color = Colors.values();
        int gege = random.nextInt(color.length);
        return  color[gege];
    }
}
