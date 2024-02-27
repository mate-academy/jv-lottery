package core.basesyntax;

public class ColorSupplier {
    public String getRandomColor() {
        Color[] colors = Color.values();
        Random random = new Random();
        return colors[random.nextInt(colors.length)];
    }
}
