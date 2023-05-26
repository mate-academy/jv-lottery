import java.util.Random;

public class ColorSupplier {
    private final Random random;

    public ColorSupplier(Random random) {
        this.random = random;
    }

    public String getRandomColor() {
        Color randomColor = Color.values()[random.nextInt(Color.values().length)];
        return randomColor.name();
    }
}
