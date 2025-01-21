package core.basesyntax;


import java.util.Random;

public class ColorSupplier {
    private final Colors[] colors;

    public ColorSupplier(Colors[] colors) {
        this.colors = colors;
    }

    public String getRandomColor() {
        Random random = new Random();
        int index = random.nextInt(colors.length);
        return colors[index].toString();
    }
}
